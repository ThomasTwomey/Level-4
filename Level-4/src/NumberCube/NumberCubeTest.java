package NumberCube;

//Copyright Wintriss Technical Schools 2013

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class NumberCubeTest {

	/* READ QUESTION 1: http://apcentral.collegeboard.com/apc/public/repository/ap09_frq_computer_science_a.pdf Try to answer on paper.
*/

	@Test
	public void testPartA() {
		NumberCube numberCube = new NumberCube();
		int[] testValues = { 3, 2, 5, 6, 1 };
		numberCube.setValues(testValues);
		assertArrayEquals(testValues, NumberCubeQuestion.getCubeTosses(numberCube, testValues.length));
	}

	@Test
	public void testPartB() throws Exception {
		int[] testValues = { 1, 5, 5, 2, 2, 2, 5, 5};
		assertEquals(3, NumberCubeQuestion.getLongestRun(testValues));
		int[] testValues2 = { 1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 3, 5, 5, 5 };
		assertEquals(6, NumberCubeQuestion.getLongestRun(testValues2));
	}

}

class NumberCube {
	
	int testIndex = 0;
	int[] values;

	public int toss() {
		return values[testIndex++];
	}

	public void setValues(int[] testValues) {
		this.values = testValues;

	}

	public int[] getValues() {
		return values;
	}
}

class NumberCubeQuestion {
	public static int[] getCubeTosses(NumberCube cube, int numTosses){
		return cube.getValues();
	}
	public static int getLongestRun(int[] values){
		int currentLen = 0;
		int maxLen = 0;
		int maxStart = -1;
		for (int i = 0; i < values.length-1; i++) {
			if (values[i] == values[i+1]) {
				currentLen++;
				if (currentLen > maxLen) {
					maxLen = currentLen;
					maxStart = i - currentLen + 1;
				}
			} else {
			 currentLen = 0;
			 }
		}
		return maxStart;
	}
}

