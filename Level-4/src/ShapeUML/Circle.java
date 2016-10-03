package ShapeUML;

public class Circle extends Ellipse{
	private float radius;
	
	public Circle(float radius){
		super(radius, radius);
		this.radius = radius;
		area = (float)(radius * radius * Math.PI);
	}
	
	public float getArea(){
		return (float)(radius * radius * Math.PI);
	}
	
	public float getPerimeter(){
		return (float)(radius * 2 * Math.PI);
	}
	
	public float getRadius(){
		return radius;
	}
}
