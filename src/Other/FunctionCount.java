package Other;

public class FunctionCount {
	
	private static int count = 0;
	
	public void countFunction()
	{
		synchronized(this)
		{
			count ++;
		}
	}
}
