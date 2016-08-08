package basicConstructors;

public class Character{
	boolean isEvil;
	String name;
	
	Character(String name, boolean isEvil) {
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public boolean isEvil(){
		return isEvil;
	}
	
	public String getName(){
		return name;
	}
}
