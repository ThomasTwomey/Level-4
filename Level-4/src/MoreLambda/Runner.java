package MoreLambda;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		int[] stuff = {3, 2, 1};
		sortingStuff(stuff, (int[] array) -> {
			int n = array.length;
		    int temp = 0;

		    for (int i = 0; i < n; i++) {
		        for (int j = 1; j < (n - i); j++) {

		            if (array[j - 1] > array[j]) {
		                temp = array[j - 1];
		                array[j - 1] = array[j];
		                array[j] = temp;
		            }

		        }
		    }
		});
		for(int i = 0; i < stuff.length; i++){
			System.out.println(stuff[i]);
		}
	}
	
	public static int[] sortingStuff(int[] arr, Sorter s){
		s.sort(arr);
		return arr;
	}

}
