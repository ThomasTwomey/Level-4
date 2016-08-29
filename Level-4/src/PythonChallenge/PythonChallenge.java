package PythonChallenge;

public class PythonChallenge {
	public static void main(String[] args) {
		twoLessChar("sqgle qrpgle.kyicrpylq() gq pcamkkclbcb");
	}

	public static void twoLessChar(String x){
		String y = "";
		for(int i = 0; i < x.length(); i++){
			if(x.charAt(i) == 'b' || x.charAt(i) == 'a' || x.charAt(i) == '.' || x.charAt(i) == '(' || x.charAt(i) == ')' || x.charAt(i) == ' ' || x.charAt(i) == '\''){
				y+= x.charAt(i);
			}
			else{
				int temp = (int)x.charAt(i);
				temp = temp + 2;
				char tempChar = (char)temp;
				y += tempChar;
			}
		}
		System.out.println(y);
	}
	
	public static void findRareCharacters(String x){
		for(int i = 0; i < x.length(); i++){
			
		}
	}
	

}
