package baek_18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Que 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Qu q = new Qu();
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken())
			{
				case "push":
					q.push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					sb.append(q.pop()+"\n");
					break;
				case "size":
					sb.append(q.size()+"\n");
					break;
				case "empty":
					sb.append(q.empty()+"\n");
					break;
				case "front":
					sb.append(q.front()+"\n");
					break;
				case "back":
					sb.append(q.back()+"\n");
					break;
			}
		}
		System.out.println(sb);
	}

}

class Qu
{
	static Queue<Integer> queue = new LinkedList<>();
	static int last=0;
	public void push(int input)
	{
		queue.add(input);
		last = input;
	}
	
	public int pop()
	{
		if(queue.peek() != null)
		{
			return queue.poll();
		}
		else
		{
			return -1;
		}
	}
	public int size()
	{
		return queue.size();
	}
	public int empty()
	{
		if(queue.isEmpty())
		{
			return 1;//비어있을때
		}
		else
		{
			return 0;//안비어있을때
		}
	}
	public int front()
	{
		if(queue.peek()==null)
		{
			return -1;
		}
		else
		{
			return queue.peek();
		}
	}
	public int back()
	{
		if(queue.peek()==null)
		{
			return -1;
		}
		else
		{
			return last;
		}
	}
}
