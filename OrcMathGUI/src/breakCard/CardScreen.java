package breakCard;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CardScreen extends FullFunctionScreen implements FileRequester{

	private static final long serialVersionUID = 258186143576427947L;
	private TextField descriptionField;
	private TextArea text;
	private Button addButton;

	public CardScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButton = new Button(0,50,200,50,"Go to inside", new Action() {

			@Override
			public void act() {
				CardMakerGUI.card.setScreen(CardMakerGUI.inside);
			}
		});
		viewObjects.add(addButton);
		addButton = new Button(0,450,200,50,"Go to front", new Action() {

			@Override
			public void act() {
				CardMakerGUI.card.setScreen(CardMakerGUI.front);
			}
		});
		viewObjects.add(addButton);
	}

	protected void addClicked() {

	}

	@Override
	public void setFile(File f) {
		// TODO Auto-generated method stub

	}

	@Override
	public JFrame getWindow() {
		// TODO Auto-generated method stub
		return null;
	}

}
