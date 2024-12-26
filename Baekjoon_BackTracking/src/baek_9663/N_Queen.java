package baek_9663;
//https://st-lab.tistory.com/118 도움받은 곳

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_Queen 
{
	static int map[];
	static int N;
	static int count =0;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		map = new int[N];
		
		maker(0);
		System.out.println(count);
	}
	
	public static void maker(int depth)
	{
		if(depth == N)
		{
			count++;
			return;
		}
		
		for(int i=0;i<map.length;i++)
		{
			map[depth] =i;
			
			if(checkPos(depth))
			{
				maker(depth+1);
			}
		}
	}
	
	public static boolean checkPos(int y)
	{
		for(int i=0;i<y;i++)//이전에 할당된 각 y값위치(없을수도 있음)를 순서대로 
		//매개변수로 넘어온 y위치와 비교
		{
			if(map[i] == map[y])
			{
				return false;
			}
			else if(Math.abs(i-y) == Math.abs(map[i]-map[y]))
			{
				return false;
			}
		}
		return true;
	}
}
