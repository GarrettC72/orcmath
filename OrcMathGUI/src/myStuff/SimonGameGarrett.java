package myStuff;

import guiTeacher.GUIApplication;

public class SimonGameGarrett extends GUIApplication{
	
	public static SimonGameGarrett game;
	
	public SimonGameGarrett(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static void main(String[] args){
		game = new SimonGameGarrett(800, 550);
		Thread runner = new Thread(game);
		runner.start();
	}

	@Override
	public void initScreen() {
		SimonScreenGarrett screen = new SimonScreenGarrett(getWidth(), getHeight());
		setScreen(screen);
	}

}
