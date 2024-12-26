package baek_10773;

import java.util.Scanner;
import java.util.Stack;

public class Zero1 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i=0;i<count;i++)
		{
			stack.push(sc.nextInt());
			
			if(stack.peek()==0)
			{
				stack.pop();//0제거
				stack.pop();//잘못쓴 값 제거
			}
		}
		
		int tot = 0;
		int temp;
		
		while(!stack.isEmpty())
		{
			temp = stack.pop();
			tot += temp;
		}
		System.out.println(tot);
	}
}
