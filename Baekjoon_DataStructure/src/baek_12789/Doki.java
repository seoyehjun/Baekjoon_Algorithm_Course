package baek_12789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Doki
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++)
		{
			que.add(Integer.parseInt(st.nextToken()));
		}
		
		int status=1;
		while(!que.isEmpty())
		{
			if(que.peek()==status)
			{
				que.poll();
				status++;
			}
			else if(!stack.isEmpty() && stack.peek()==status)
			{
				stack.pop();
				status++;
			}
			else
			{
				stack.push(que.poll());
			}
		}
		
		while(!stack.isEmpty())
		{
			if(stack.peek()==status)
			{
				stack.pop();
				status++;
			}
			else
			{
				System.out.println("Sad");
				return; 
			}
		}
		
		System.out.println("Nice");			
	}
}
