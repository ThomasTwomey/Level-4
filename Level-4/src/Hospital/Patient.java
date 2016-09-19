package Hospital;

public class Patient{
	boolean feelsCaredFor;
	boolean isAlive;
	
	public Patient(){
		feelsCaredFor = false;
		isAlive = true;
	}
	
	public boolean isAlive(){
		return isAlive;
	}
	
	public void kill(){
		isAlive = false;
	}
	
	public void checkPulse(){
		feelsCaredFor = true;
	}

	public boolean feelsCaredFor() {
		return feelsCaredFor;
	}

	public void setFeelsCaredFor(boolean feelsCaredFor) {
		this.feelsCaredFor = feelsCaredFor;
	}
}