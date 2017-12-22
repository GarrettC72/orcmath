package breakCard;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class InsideScreen extends FullFunctionScreen implements FileRequester{

	public InsideScreen(int width, int height) {
		super(width, height);
	}

	private static final long serialVersionUID = 258186143576427947L;
	private TextField descriptionField;
	private TextArea text;
	private Button frontButton;
	private Graphic graphic;

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		graphic = new Graphic(100,150,"resources/inside.jpg");
		viewObjects.add(graphic);

		frontButton = new Button(0,50,200,50,"Go to front", new Action() {
			@Override
			public void act() {
				CardMakerGUI.card.setScreen(CardMakerGUI.front);
			};
		});
		viewObjects.add(frontButton);
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
