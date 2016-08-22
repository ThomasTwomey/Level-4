package Polymorphism;

import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph{

	RedMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	
	public void draw(Graphics g){
	   	 g.setColor(Color.RED);
	   	 g.fillRect(getX(), getY(), this.getWidth(), this.getHeight());
	    }
	
}