package basicConstructors;

public class IntArray{
	public static int getHighestIntInArray(int[] arr){
		int highest = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] >= highest){
				highest = arr[i];
			}
		}
		return highest;
	}
	
	public static int[] incrementIntArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = arr[i] + 1;
		}
		return arr;
	}
}