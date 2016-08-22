package Polymorphism;

import java.util.Random;

public class MovingMorph extends Polymorph{
	private int counter;
	
	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	
	@Override
	public void update(){
		setX(getX() + counter);
		setY(getY() + counter);
		counter++;
	}
	
}
