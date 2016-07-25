package IntroToSanner;

import java.util.ArrayList;
import java.util.Scanner;

public class IntroToScanner {
	
	Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		new IntroToScanner();
	}
	
	IntroToScanner(){
		ArrayList<String> userWords = new ArrayList<String>();
		String input = "";
		boolean tof = true;
		
		while(tof == true){
			input = keyboard.next();
			if(input.equals("0")){
				tof = false;
			}
			else{
				userWords.add(input);
			}
		}
		userWords = sortWords(userWords);
		System.out.println(userWords);
	}
	
	public ArrayList<String> sortWords(ArrayList<String> userWords){
		String temp = "";
		for(int i = 0; i < userWords.size(); i++){
			for(int j = 1; j < userWords.size() - i; j++){
				if(userWords.get(j - 1).compareTo(userWords.get(j)) > 0){
					temp = userWords.get(j - 1);
					userWords.set(j - 1, userWords.get(j));
					userWords.set(j, temp);
				}
			}
		}
		return userWords;
	}

}