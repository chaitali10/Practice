package Stacks;

import java.util.Stack;

public class ReversePolishNotation {	

	public int RPN(String[] tokens)
	{
		if(tokens == null || tokens.length == 0)
			throw new IllegalArgumentException("Input is invalid");

		Stack<Integer> stack = new Stack<Integer>();
		String operands = "+-/*";
		
		for(String s : tokens)
		{
			if(operands.contains(s))
			{
				int b = stack.pop();
				int a = stack.pop();

				switch(s)
				{
					case "+": 
							stack.push(a + b);
							break;
						
					case "-":
							stack.push(a-b);
							break;
	
					case "*":
							stack.push(a*b);
							break;
				
					case "/":
							stack.push(a/b);
							break;

				}
			}
			else
			{
				stack.push(Integer.parseInt(s));
			}
		}

		return stack.pop();
	}
}
