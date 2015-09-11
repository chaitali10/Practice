package Strings;

import java.util.StringTokenizer;

public class JustifyText {
	
	public void justify(String text, int LineWidth)
	{
		StringTokenizer st = new StringTokenizer(text);
		
		int SpaceLeft = LineWidth;
		int SpaceWidth = 1;
		
		while(st.hasMoreTokens())
		{
			String word = st.nextToken();
			
			if((word.length() + SpaceWidth) > SpaceLeft)
			{
				System.out.print("\n"+word+" ");
				SpaceLeft = LineWidth - word.length();
			}
			else
			{
				System.out.print(word + " ");
				SpaceLeft -= (word.length()+SpaceWidth);
			}
		}
	}
	
	public static void justify1(String s, int len) {

        if(s.length() == len) return;
        

        int count = 0;
        StringTokenizer st = new StringTokenizer(s," ");
        count = st.countTokens() - 1;

        int totalSpacing = len - s.length() + count;
        int individualSpacing = totalSpacing/count;
        int padding = totalSpacing % count;

        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()) {
            sb.append(st.nextToken());
            if(st.hasMoreTokens()) {
                for(int i = 0; i < individualSpacing; i++)
                    sb.append(" ");
            }
            if(padding > 0) {
                sb.append(" ");
                --padding;
            }
        }
        
        System.out.println(s);
	}
}
