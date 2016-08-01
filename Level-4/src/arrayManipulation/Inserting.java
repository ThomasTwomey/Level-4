package arrayManipulation;

public class Inserting {
	public int[] insertAt(int[] userNum, int pos, int value){
		int temp = 0;
		userNum[pos] = value;
		for(int i = pos + 1; i < userNum.length - 2; i++){
			userNum[i] = temp;
			temp = userNum[i+1];
		}
		userNum[userNum.length - 1] = temp;
		return userNum;
	}
	
	public String[] insertAtString(String[] userWords, int pos, String value){
		String temp = "";
		userWords[pos] = value;
		for(int i = pos + 1; i < userWords.length - 2; i++){
			userWords[i] = temp;
			temp = userWords[i+1];
		}
		userWords[userWords.length - 1] = temp;
		return userWords;
	}
	
	public String[] insertAlphabetically(String[] userWords, String word){
		int flag = 0;
		int index = 0;
		int i = 0;
		while(flag <= 0 || i > userWords.length - 1){
			flag = userWords[i].compareTo(word);
			i++;
		}
		index = i - 1;
		userWords = insertAtString(userWords, index, word);
		return userWords;
	}
}
