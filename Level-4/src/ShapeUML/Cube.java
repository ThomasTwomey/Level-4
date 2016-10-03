package ShapeUML;

public class Cube extends Shape3D{
	private float sideLength;
	
	public Cube(float sideLength){
		this.sideLength = sideLength;
	}
	
	public float getArea(){
		return (float)(Math.pow(sideLength, 3));
	}
	
	public float getSurfaceArea(){
		return (float)((Math.pow(sideLength, 2)) * 6);
	}
	
	public float getSideLength(){
		return sideLength;
	}
}
