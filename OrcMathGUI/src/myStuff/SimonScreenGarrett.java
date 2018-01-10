package myStuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenGarrett extends ClickableScreen implements Runnable{
	
	private TextLabel label;
	private ButtonInterfaceGarrett[] buttons;
	private ProgressInterfaceGarrett progress;
	private ArrayList<MoveInterfaceGarrett> sequence;
	
	private int roundNumber = 0;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;

	public SimonScreenGarrett(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(ButtonInterfaceGarrett b: buttons){ 
		    viewObjects.add(b);
		}
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceGarrett>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}
	
	private MoveInterfaceGarrett randomMove() {
		int bIndex = (int)(Math.random()*buttons.length);
	    while(bIndex == lastSelectedButton){
	        bIndex = (int)(Math.random()*buttons.length);
	    }
	    return getMove(bIndex);
	}

	/**
	Placeholder until partner finishes implementation of MoveInterface
	*/
	private MoveInterfaceGarrett getMove(int bIndex) {
		return new MoveZhehao(buttons[bIndex]);
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterfaceGarrett getProgress() {
		return new ProgressZhehao(10,10,100,100);
	}

	private void addButtons() {
		int numberOfButtons = 6;
		buttons = new ButtonInterfaceGarrett[numberOfButtons];
		Color[] colors = {Color.BLUE, Color.RED, Color.YELLOW, Color.ORANGE, Color.GREEN, Color.MAGENTA};
		for(int i = 0; i < numberOfButtons; i++) {
			final ButtonInterfaceGarrett b = getAButton();
		    buttons[i] = b;
		    b.setColor(colors[i]);
		    b.setX(200 + 20 * (int)Math.sin(Math.PI * i / 3));
		    b.setY(200 + 20 * (int)Math.sin(Math.PI * i / 3));
		    b.setAction(new Action() {
		    	public void act() {
		    		if(acceptingInput) {
		    		    Thread blink = new Thread(new Runnable(){
		    		        public void run(){
		    		        	b.highlight();
		    		            try {
		    		                Thread.sleep(800);
		    		            } catch (InterruptedException e) {
		    		                // TODO Auto-generated catch block
		    		                e.printStackTrace();
		    		            }
		    		            b.dim();
		    		        }
		    		    });
		    		    blink.start();
		    		    if(b == sequence.get(sequenceIndex).getButton()) {
		    		    	sequenceIndex++;
		    		    }
		    		    else {
		    		    	progress.gameOver();
		    		    }
		    		    if(sequenceIndex == sequence.size()){
		    		        Thread nextRound = new Thread(SimonScreenGarrett.this);
		    		        nextRound.start();
		    		    }
		    		}
		    	}
		    });
		}
	}
	
	 /**
	Placeholder until partner finishes implementation of ButtonInterface
	*/
	private ButtonInterfaceGarrett getAButton() {
		return new ButtonZhehao(0,0,50,50,"",null);
	}

	@Override
	public void run() {
	    label.setText("");
        nextRound();
	}

	private void nextRound() {
		acceptingInput = false;
		roundNumber++;
		sequence.add(randomMove());
		progress.setRound(roundNumber);
		progress.setSequenceSize(sequence.size());
		changeText("Simon's Turn");
		label.setText("");
		playSequence();
		changeText("Your Turn");
		acceptingInput = true;
		sequenceIndex = 0;
	}

	private void playSequence() {
		ButtonInterfaceGarrett b = null;
		for(int i = 0; i < sequence.size(); i++) {
			if(b != null) {
				b.dim();
			}
			b = sequence.get(sequenceIndex).getButton();
			b.highlight();
			int sleepTime = (10000 - (roundNumber * 100)) + 1000;
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		b.dim();
	}

	private void changeText(String string) {
		label.setText(string);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
