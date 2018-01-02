package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button {
	
	private String s1;
	private String s2;
	private Color c;

	public CustomButton(int x, int y) {
		super(x, y, 500, 500, "", null);
		// TODO Auto-generated constructor stub
	}
	
	public void drawButton(Graphics2D g, boolean hover){
		g.setColor(Color.BLACK);
		g.drawString(s1, 30, 30);
		g.drawString(s2, 60, 60);
		g.drawRect(100, 100, 75, 75);
		
	}
	
	void updateString1(String string) {
		
	}

	void updateString2(String string) {
		
	}

	void setIconColor(Color color) {
		
	}

}
