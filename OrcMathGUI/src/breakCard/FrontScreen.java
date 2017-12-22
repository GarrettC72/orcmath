package breakCard;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class FrontScreen extends FullFunctionScreen implements FileRequester{

	private static final long serialVersionUID = 258186143576427947L;
	private TextField descriptionField;
	private TextArea text;
	private Button insideButton;
	private Graphic graphic;

	public FrontScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		graphic = new Graphic(50,100,"resources/holidays.png");
		viewObjects.add(graphic);

		insideButton = new Button(0,50,200,50,"Go to inside", new Action() {
			@Override
			public void act() {
				CardMakerGUI.card.setScreen(CardMakerGUI.inside);
			}
		});
		viewObjects.add(insideButton);
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
