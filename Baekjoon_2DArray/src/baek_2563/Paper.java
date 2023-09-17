package baek_2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Paper 
{
	public static void main(String[] args) throws IOException
	{
		int[][] bigpaper = new int[100][100];
		
		for(int i=0;i<bigpaper.length;i++)
		{
			for(int j=0;j<bigpaper[0].length;j++)
			{
				bigpaper[i][j] = 0;
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0 ; i<count ; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int q=bigpaper.length-y-1 ; q>bigpaper.length-y-1-10 ; q--)
			{
				for(int z = x ; z<x+10 ; z++)
				{
					bigpaper[q][z] = 1;
				}
			}
		}
		
		int count1 =0;
		for(int i=0;i<bigpaper.length;i++)
		{
			for(int j=0;j<bigpaper[0].length;j++)
			{
				if(bigpaper[i][j] == 1)count1++;
			}
		}
		System.out.print(count1);
		
	}
}
