package breakCard;

import guiTeacher.GUIApplication;

public class CardMakerGUI extends GUIApplication {

	private static final long serialVersionUID = 258186143576427947L;
	static CardMakerGUI card;
	static FrontScreen front;
	static InsideScreen inside;

	public CardMakerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		inside = new InsideScreen(getWidth(),getHeight());
		front = new FrontScreen(getWidth(),getHeight());
		setScreen(front);
	}

	public static void main(String[] args) {
		card = new CardMakerGUI(900,700);
		Thread go = new Thread(card);
		go.start();
	}

}
