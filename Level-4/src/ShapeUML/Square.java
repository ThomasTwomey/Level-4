package ShapeUML;

public class Square extends Rectangle{
	private float sideLength;
	
	public Square(float sideLength){
		super(sideLength, sideLength);
	}
	
	public float getPerimeter(){
		return sideLength * 4;
	}
}
