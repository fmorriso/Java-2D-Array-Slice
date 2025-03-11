/*
 * AP Computer Science
 * 2018 Exam Free Response
 * 4. Array Slice
 * */
import java.util.Arrays;

public class ArraySliceTester
{

	public static void main(String[] args)
	{
		int[][] arr2D = {
				{0, 1, 2}, 
				{3, 4, 5}, 
				{6, 7, 8}, 
				{9, 5, 3}
				};

		// extract column 1 from the 2d array
		int[] result = ArrayTester.getColumn(arr2D, 1);
		System.out.println("result: " + Arrays.toString(result));
	}

}
