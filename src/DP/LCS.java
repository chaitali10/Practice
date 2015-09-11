package DP;

public class LCS {

	public void longestCommonSubsequence(String s1, String s2)
	{
		int s1Length = s1.length();
		int s2Length = s2.length();

		int[][] lcs = new int[s1Length + 1][s2Length + 1];

		for(int i=1; i<=s1Length; i++)
		{
			for(int j=1; j<=s2Length; j++)
			{
				if(s1.charAt(i-1) == s2.charAt(j-1))
				{
					lcs[i][j] = lcs[i-1][j-1] + 1;
				}
				else
				{
					lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
				}
			}
		}

		//System.out.println(lcs[s1Length][s2Length]);
		
		int i = s1Length, j = s2Length;
		String output = "";

		while(i > 0 && j > 0)
		{
			if(s1.charAt(i-1) == s2.charAt(j-1))
			{
				output = s1.charAt(i-1) + output;
				i--;
				j--;
			}
			else if (lcs[i-1][j] >= lcs[i][j-1])
			{
				i--;
			}
			else
			{
				j--;
			}
		}

		System.out.println(output);		 
	}
}
