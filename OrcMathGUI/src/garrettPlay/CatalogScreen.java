package garrettPlay;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen implements FileRequester{
	
	private static final long serialVersionUID = 258186143576427947L;
	private TextField descriptionField;
	private TextArea text;
	private Button addButton;
	private FileOpenButton openButton;
	private CatalogMaker catalog;

	public CatalogScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		descriptionField = new TextField(40,40,200,30,"Please enter the name of the Pokemon","Pokemon");
		viewObjects.add(descriptionField);
		
		descriptionField = new TextField(40,100,200,30,"Please enter the level of the Pokemon","Level");
		descriptionField.setInputType(1);
		viewObjects.add(descriptionField);
		
		descriptionField = new TextField(40,160,200,30,"Please enter how many of that Pokemon you have","Quantity");
		descriptionField.setInputType(1);
		viewObjects.add(descriptionField);
		
		text = new TextArea(40,220,200,60, "This is where text goes.");
		viewObjects.add(text);
		addButton = new Button(40,280,200,30,"Add", new Action() {
			
			@Override
			public void act() {
				addClicked();
			}
		});
		viewObjects.add(addButton);
		addButton = new Button(40,330,200,30,"Save", new Action() {
			
			@Override
			public void act() {
				addClicked();
			}
		});
		viewObjects.add(addButton);
		addButton = new Button(40,380,200,30,"Delete", new Action() {
			
			@Override
			public void act() {
				addClicked();
			}
		});
		viewObjects.add(addButton);
		addButton = new Button(40,430,200,30,"Load", new Action() {
			
			@Override
			public void act() {
				addClicked();
			}
		});
		viewObjects.add(addButton);
		openButton = new FileOpenButton(40, 480, 200, 30, null, this);
		viewObjects.add(openButton);
		catalog = new CatalogMaker();
	}

	protected void addClicked() {
		Pokemon p = new Pokemon(descriptionField.getText(),Integer.parseInt(descriptionField.getText()),Integer.parseInt(descriptionField.getText()));
		text.setText(p.toString());
		catalog.addPokemon(p);
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
