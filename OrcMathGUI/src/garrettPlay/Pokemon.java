package garrettPlay;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Pokemon extends AnimatedComponent {
	
	private String name;
	private int level;
	private int quantity;
	private String imgAddress;

	public Pokemon(String name, int level, int quantity) {
		super(150, 150, 100, 100);
		this.name = name;
		this.level = level;
		this.quantity = quantity;
		addSequence("resources/char.gif", 200, 70, 8, 32, 33, 7);
		Thread animation = new Thread(this);
		animation.start();
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.CYAN);
		super.update(g);
	}
	
	public String toString() {
		return name + ", " + level + ", " + quantity;
	}

}
