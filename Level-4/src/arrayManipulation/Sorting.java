package arrayManipulation;

public class Sorting {
	public String[] sort(String userWords[]){
		String temp = "";
		for(int i = 0; i < userWords.length; i++){
			for(int j = 1; j < userWords.length - i; j++){
				if(userWords[j - 1].compareTo(userWords[j]) > 0){
					temp = userWords[j - 1];
					userWords[j - 1] = userWords[j];
					userWords[j] = temp;
				}
			}
		}
		System.out.println(userWords);
		return userWords;
	}
}