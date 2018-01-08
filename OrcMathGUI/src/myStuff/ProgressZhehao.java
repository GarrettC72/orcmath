package myStuff;

import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressZhehao extends Component implements ProgressInterfaceGarrett {

	public ProgressZhehao(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gameOver() {
		

	}

	@Override
	public int setRound(int n) {
		return n+1;

	}

	@Override
	public int setSequenceSize(int n) {
		return n+1;
	}

	@Override
	public void update(Graphics2D g) {
		

	}

}
