package baek_2164;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Throw_some_card 
{
	public static void main(String[] args) 
	{
		Queue<Integer> que = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		//하나는 poll and add
		//하나는 remove
		
		for(int i=1;i<=N;i++)
		{
			que.add(i);//que에 순서대로 숫자 집어넣기
		}
		
		int count=1;
		int temp, status=1;
		while(!que.isEmpty())
		{
			if(count%2==1)
			{
				status = que.poll();		
			}
			else
			{
				status = que.poll();
				que.add(status);
			}
			
			count ++;
		}
		
		System.out.println(status);
	}
}
