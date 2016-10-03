package ShapeUML;

public class Sphere extends Shape3D{
	private float radius;
	
	public Sphere(float radius){
		this.radius = radius;
	}
	
	public float getArea(){
		return (float)((4/3) * Math.PI * Math.pow(radius, 3));
	}
	
	public float getSurfaceArea(){
		return (float)(4 * Math.PI * Math.pow(radius, 2));
	}
	
	public float getRadius(){
		return radius;
	}
}
