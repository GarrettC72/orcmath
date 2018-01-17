package tests;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.StyledComponent;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class TestOneScreen extends FullFunctionScreen {
	
	private TextLabel text;
	private Button winButton;
	private Button loseButton;

	public TestOneScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		StyledComponent.setButtonOutline(true);
		text = new TextLabel(200,50,100,50,"");
		viewObjects.add(text);
		winButton = new Button(0,400,75,75,"Win", new Action() {

			@Override
			public void act() {
				text.setText("You win.");
				winButton.setEnabled(false);
				loseButton.setEnabled(false);
			}
			
		});
		viewObjects.add(winButton);
		loseButton = new Button(400,400,75,75,"Lose", new Action() {

			@Override
			public void act() {
				text.setText("You lose.");
				winButton.setEnabled(false);
			}
			
		});
		viewObjects.add(loseButton);		
	}

}
