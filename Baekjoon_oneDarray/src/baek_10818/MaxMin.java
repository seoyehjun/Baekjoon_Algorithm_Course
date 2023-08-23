package baek_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxMin 
{
	public static int comparemin(int a, int b)
	{
		if (a>= b) return b;
		else return a;
	}
	public static int comparemax(int a, int b)
	{
		if(a>=b) return a;
		else return b;
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader
			(new InputStreamReader(System.in));
		
	
		int num = Integer.parseInt(br.readLine());
		int[] list = new int[num];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int i = 0;
		while(st.hasMoreTokens())
		{
			list[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		int min= list[0], max=list[0];
		
		for(int j=0;j<list.length;j++)
		{
			min =comparemin(min,list[j]);
			max = comparemax(max,list[j]);
		}
		System.out.print(min + " " + max);
	}
	
	
}
