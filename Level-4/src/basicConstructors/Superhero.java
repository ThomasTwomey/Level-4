package basicConstructors;

public class Superhero extends Character{
	String superpower;
	
	Superhero(String name, String superpower) {
		super(name, false);
		this.superpower = superpower;
	}
	
	Superhero(String name, String superpower, boolean isEvil) {
		super(name, isEvil);
		this.superpower = superpower;
	}
	
	public String getSuperpower(){
		return superpower;
	}
	
}
