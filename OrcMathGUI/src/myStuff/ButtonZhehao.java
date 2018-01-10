package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiTeacher.Utilities;
import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonZhehao extends Button implements ButtonInterfaceGarrett{
	
	private Color color;
	private boolean buttonState;

	public ButtonZhehao(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text, color, action);
		update();
	}

	public ButtonZhehao(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, "", null);
		update();
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
		setBackground(color);
	}

	@Override
	public void highlight() {
		setColor(Color.WHITE);
	}

	@Override
	public void dim() {
		setColor(color);
	}
	
	public void drawButton(Graphics2D g, boolean hover) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		drawShape(g, hover);
		g.setColor(color);
	}

}
