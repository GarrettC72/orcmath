package myStuff;

import guiTeacher.components.Graphic;

public class MoveZhehao implements MoveInterfaceGarrett {
	
	private ButtonInterfaceGarrett button;
	
	public MoveZhehao(ButtonInterfaceGarrett bIndex) {
		button = bIndex;
	}

	@Override
	public ButtonInterfaceGarrett getButton() {
		return button;
	}
	
}
