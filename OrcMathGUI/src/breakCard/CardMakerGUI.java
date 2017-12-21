package breakCard;

import guiTeacher.GUIApplication;

public class CardMakerGUI extends GUIApplication {

	private static final long serialVersionUID = 258186143576427947L;
	static CardMakerGUI card;
	static CardScreen front;
	static CardScreen inside;

	public CardMakerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		inside = new CardScreen(getWidth(),getHeight());
		front = new CardScreen(getWidth(),getHeight());
		setScreen(front);
	}

	public static void main(String[] args) {
		card = new CardMakerGUI(800,550);
		Thread go = new Thread(card);
		go.start();
	}

}
