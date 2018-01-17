package tests;

import guiTeacher.GUIApplication;

public class TestMain extends GUIApplication {

	public TestMain(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		//TestOneScreen oneScreen = new TestOneScreen(getWidth(), getHeight());
		//setScreen(oneScreen);
		TestTwoScreen twoScreen = new TestTwoScreen(getWidth(), getHeight());
		setScreen(twoScreen);
	}

	public static void main(String[] args) {
		TestMain testOne = new TestMain(800,550);
		Thread runner = new Thread(testOne);
		runner.start();
	}

}
