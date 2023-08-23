package baek_10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Smaller 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int  X;
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int[] list = new int[Integer.parseInt(st1.nextToken())];
		X = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int idx = 0;
		
		while(st2.hasMoreTokens())
		{
			list[idx] = Integer.parseInt(st2.nextToken()); 
			idx ++;
		}
		
		int count =0;
		
		for(int i=0;i<list.length;i++)
		{
			if (list[i]<X)System.out.print(list[i]+" ");
		}
		
		
		
	}
}
