package baek_1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Giveleg //hashmap을 써볼까?
{
	static int[][] map = new int[31][31];//뭐시기 삼각형
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int times = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<times;i++)
		{
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());			
			
			System.out.println(combination(M,N));			
		}
		
		
	}
	
	private static int combination(int a, int b)
	{
		if(map[a][b] >0)
		{
			return map[a][b];
		}
		else if(a==b||b==0)
		{
			return map[a][b] =1;
		}
		else
		{
			return map[a][b] = combination(a-1,b-1) + combination(a-1,b);
		}
	}
}
