package baek_28279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Deck 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Realdeck deck = new Realdeck();
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			int option = Integer.parseInt(st.nextToken());
			
			switch(option)
			{
			case 1:
				deck.f1(Integer.parseInt(st.nextToken()));
				break;
				
			case 2:
				deck.f2(Integer.parseInt(st.nextToken()));
				break;
				
			case 3:
				sb.append(deck.f3()+"\n");
				break;
				
			case 4:
				sb.append(deck.f4()+"\n");
				break;
				
			case 5:
				sb.append(deck.f5()+"\n");
				break;
				
			case 6:
				sb.append(deck.f6()+"\n");
				break;
				
			case 7:
				sb.append(deck.f7()+"\n");
				break;
				
			case 8:
				sb.append(deck.f8()+"\n");
				break;
			}
		}
		
		System.out.println(sb);
	}
}
class Realdeck
{
	LinkedList<Integer> list = new LinkedList<>();
	
	public void f1(int input)
	{
		list.addFirst(input);
	}
	
	public void f2(int input)
	{
		list.addLast(input);
	}
	
	public int f3()
	{
		if(!list.isEmpty())
		{
			return list.pollFirst();			
		}
		else
		{
			return -1;
		}
	}
	
	public int f4()
	{
		if(!list.isEmpty())
		{
			return list.pollLast();			
		}
		else
		{
			return -1;
		}
	}
	
	public int f5()
	{
		return list.size();
	}
	
	public int f6()
	{
		if(list.isEmpty())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public int f7()
	{
		if(!list.isEmpty())
		{
			return list.peekFirst();			
		}
		else
		{
			return -1;
		}
	}
	
	public int f8()
	{
		if(!list.isEmpty())
		{
			return list.peekLast();			
		}
		else
		{
			return -1;
		}
	}
}
