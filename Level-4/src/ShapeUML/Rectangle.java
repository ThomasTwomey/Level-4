package ShapeUML;

public class Rectangle extends Shape2D{
	private float base;
	private float height;
	
	public Rectangle(float base, float height){
		this.base = base;
		this.height = height;
	}
	
	public float getArea(){
		return base * height;
	}
	
	public float getPerimeter(){
		return (base * 2) + (height * 2);
	}
	
	public float getBase(){
		return base;
	}
	
	public float getHeight(){
		return height;
	}
}
