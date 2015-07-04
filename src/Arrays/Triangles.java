package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Three segments of lengths A, B, C form a triangle if
 *
 * A + B > C
 * B + C > A
 * A + C > B
 *
 * e.g.
 * 6, 4, 5 can form a triangle
 * 10, 2, 7 can't
 *
 * Given a list of segments lengths algorithm should find at least one triplet of segments that form a triangle (if any).
 *
 * Method should return an array of either:
 * - 3 elements: segments that form a triangle (i.e. satisfy the condition above)
 * - empty array if there are no such segments
 */

// TODO: consider arithematic overflow
public class Triangles {

	public int[] getTriangleSides(int[] segments) 
	{
		int[] result = new int[3];
		Arrays.sort(segments);
		
		for(int k=segments.length - 1; k>0; k--)
		{
			int i = 0;
			int j = k-1;
			
			while(i < j)
			{
				if(segments[i] + segments[j] > segments[k])
				{
					result[0] = segments[i];
					result[1] = segments[j];
					result[2] = segments[k];
					
					return result;
				}
				else
				{
					i++;
				}
			}
		}
		
		return result;
		
	}

}
