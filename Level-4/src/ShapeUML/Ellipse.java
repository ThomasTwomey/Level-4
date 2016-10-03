package ShapeUML;

public class Ellipse extends Shape2D{
	private float majorRadius;
	private float minorRadius;
	
	public Ellipse(float majorRadius, float minorRadius){
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
	}
	
	public float getArea(){
		return (float)(majorRadius * minorRadius * Math.PI);
	}
	
	public float getPerimeter(){
		return (float)(2 * Math.PI * Math.sqrt(((majorRadius * majorRadius) + (minorRadius * minorRadius)) / 2));
	}
	
	public float getMajorRadius(){
		return majorRadius;
	}
	
	public float getMinorRadius(){
		return minorRadius;
	}
}
