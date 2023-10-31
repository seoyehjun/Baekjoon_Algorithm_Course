package baek_28278;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack2
{
	public static void main(String[] args) throws IOException
	{
		Stack stack = new Stack();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			int option = Integer.parseInt(st.nextToken());
			int param=1;
			if(option ==1)
			{
				 param = Integer.parseInt(st.nextToken());				
			}
			
			switch(option)
			{
				case 1:
					stack.put(param);
					break;
				case 2:
					stack.output();
					break;
				case 3:
					stack.count();
					break;
				case 4:
					stack.isnull();
					break;
				case 5:
					stack.outputnomodify();
					break;
			}
		}
		System.out.println(stack.sb);
	}
}

class Stack
{
	
	static int[] list = new int[1000000];
	static int status =0;
	static StringBuilder sb = new StringBuilder();
	
	
	//1
	public static void put(int input)
	{
		list[status++] = input;
	}
	
	//2 맨위에수 빼고나서 출력 --> status의 수정 필요
	public static void output()
	{
		if(status !=0)
		{	
			sb.append(list[--status]+"\n");
		}
		else
		{
			sb.append(-1+"\n");
		}
	}
	
	//3 스택 수 출력
	public static void count()
	{
		sb.append(status+"\n");
	}
	
	//4 is null?
	public static void isnull()
	{
		if(status ==0)
		{
			sb.append(1+"\n");
		}
		else 
		{
			sb.append(0+"\n");
		}
	}
	
	//5 status 수정 없는 출력
	public static void outputnomodify()
	{
		if(status !=0)
		{	
			sb.append(list[status-1]+"\n");
		}
		else
		{
			sb.append(-1+"\n");
		}
	}
}
