package ShapeUML;

public class ShapeRunner {

	public static void main(String[] args) {
		new ShapeRunner().run();
	}
	
	public void run(){
		EqTriPyramid test = new EqTriPyramid(5f);
		System.out.print(test.getSurfaceArea());
	}

}
