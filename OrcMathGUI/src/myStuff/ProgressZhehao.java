package myStuff;

import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressZhehao extends Component implements ProgressInterfaceGarrett {
	
	private int roundNumber;
	private int sequenceSize;

	public ProgressZhehao(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gameOver() {
		
	}

	@Override
	public void setRound(int n) {
		roundNumber = n;
	}

	@Override
	public void setSequenceSize(int n) {
		sequenceSize = n;
	}

	@Override
	public void update(Graphics2D g) {
		

	}

}
