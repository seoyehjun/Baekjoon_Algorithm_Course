package baek_10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zero 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack stack = new Stack();
		
		int user_input;
		for(int i=0;i<N;i++)
		{
			user_input = Integer.parseInt(br.readLine());
			
			if(user_input!=0)
			{//일반적인 숫자일 경우
				stack.input(user_input);
			}
			else
			{
				stack.delete();
			}
		}
		
		System.out.println(stack.sum());
	}
}

class Stack
{
	static int[] result = new int[100000];
	static int status=0;
	
	public static void input(int num)
	{
		result[status++] = num;
	}
	
	public static void delete()
	{
		status--;
	}
	public static int sum()
	{
		int tot=0;
		for(int i=0;i<status;i++)
		{
			tot += result[i];
		}
		
		return tot;
	}
}