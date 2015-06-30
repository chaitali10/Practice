package Arrays;

public class SpiralMatrix {

	public static void printMatrix(int[][] matrix)
	{
		if(matrix == null)
			throw new IllegalArgumentException();
		
		int top = 0, bottom = matrix.length - 1;
		int left = 0, right = matrix[0].length - 1;
		
		while(top <= bottom && left <= right)
		{
			// print first row
			for(int i=left; i<=right; i++)
			{
				System.out.print(matrix[top][i]);
			}
			top++;
			
			// print last column
			for(int i=top; i<=bottom; i++)
			{
				System.out.print(matrix[i][right]);
			}
			right--;
			
			// print last row
			for(int i=right; i>=left; i--)
			{
				System.out.print(matrix[bottom][i]);
			}
			bottom--;
			
			// print first column
			for(int i=bottom; i>=top; i--)
			{
				System.out.print(matrix[i][left]);
			}
			left++;
		}
	}
}
