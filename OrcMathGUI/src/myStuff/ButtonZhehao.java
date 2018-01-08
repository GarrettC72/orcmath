package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.Utilities;
import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonZhehao extends Button implements ButtonInterfaceGarrett{

	public ButtonZhehao(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text, color, action);
		// TODO Auto-generated constructor stub
	}

	public ButtonZhehao(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, text, action);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void setColor(Color color) {
		setBackground(color);
		
	}

	@Override
	public void highlight() {
		Color mycolor = getBackgroundColor();
		Utilities.lighten(mycolor,50);
		
	}

	@Override
	public void dim() {
		Color mycolor= getBackgroundColor();
		Utilities.lighten(mycolor,-50);
		
	}
	public void drawButton(Graphics2D g, boolean hover) {
		
	}

}
