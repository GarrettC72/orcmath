package myStuff;

import guiTeacher.GUIApplication;

public class SimonGameGarrett extends GUIApplication{
	
	public SimonGameGarrett(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static void main(String[] args){
		SimonGameGarrett s = new SimonGameGarrett(800, 550);
		Thread runner = new Thread(s);
		runner.start();
	}

	@Override
	public void initScreen() {
		SimonScreenGarrett screen = new SimonScreenGarrett(getWidth(), getHeight());
		setScreen(screen);
	}

}
