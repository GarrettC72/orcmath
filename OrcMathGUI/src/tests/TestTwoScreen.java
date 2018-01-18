package tests;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.StyledComponent;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class TestTwoScreen extends FullFunctionScreen {

	private Button playButton;
	private TextLabel scoreDisplay;
	private TextLabel countdown;
	private TextLabel clock;
	private boolean isPlaying = false;
	private int count = 0;

	public TestTwoScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		StyledComponent.setButtonOutline(true);
		scoreDisplay = new TextLabel(400, 50, 100, 50, "Score: " + count);
		viewObjects.add(scoreDisplay);
		countdown = new TextLabel(100, 100, 100, 50, "");
		viewObjects.add(countdown);
		clock = new TextLabel(100, 200, 100, 50, "");
		viewObjects.add(clock);
		playButton = new Button(400,200,100,100,"Ready", new Action() {

			@Override
			public void act() {
				if(!isPlaying) {
					Thread count = new Thread(new Runnable(){
						public void run(){
							playButton.setEnabled(false);
							for(int i = 3; i > 0; i--) {
								countdown.setText(i + "...");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							countdown.setText("Go!");
							playButton.setText("Click Me!");
							playButton.setEnabled(true);
							isPlaying = true;
							for(int i = 5; i > 0; i--) {
								clock.setText(i + " seconds left");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							clock.setText("0 seconds left");
							playButton.setText("Done.");
							playButton.setEnabled(false);
							isPlaying = false;
						}
					});
					count.start();
				}else {
					count++;
					scoreDisplay.setText("Score: " + count);
				}
			}
		});
		viewObjects.add(playButton);
	}
}
