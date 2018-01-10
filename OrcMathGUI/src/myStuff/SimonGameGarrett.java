package myStuff;

import guiTeacher.GUIApplication;

public class SimonGameGarrett extends GUIApplication{
	
	public static SimonGameGarrett game;
	public static SimonScreenGarrett screen;
	
	public SimonGameGarrett(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static void main(String[] args){
		game = new SimonGameGarrett(850, 550);
		Thread runner = new Thread(game);
		runner.start();
	}

	@Override
	public void initScreen() {
		screen = new SimonScreenGarrett(getWidth(), getHeight());
		setScreen(screen);
	}

}
