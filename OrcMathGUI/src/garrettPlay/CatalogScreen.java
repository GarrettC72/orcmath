package garrettPlay;

import java.util.List;

import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {
	
	private static final long serialVersionUID = 258186143576427947L;
	private TextField descriptionField;

	public CatalogScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		descriptionField = new TextField(40,40,200,30,"Enter title","Title");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(40,100,200,30,"Enter author","Author");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(40,160,200,30,"Enter page number","Page number");
		viewObjects.add(descriptionField);
	}

}
