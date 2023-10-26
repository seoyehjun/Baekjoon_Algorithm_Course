package baek_2485;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeSimGi
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int gap =1000000000;
		int[] list = new int[N];
		
		list[0] = Integer.parseInt(br.readLine());
		for(int i=1;i<N;i++)
		{
			list[i] = Integer.parseInt(br.readLine());
			if(list[i]-list[i-1]<gap)gap = list[i]-list[i-1];
		}
		
		int count =0, nowval=list[0];
		
		while()
		{
			int i=0;
			if(list[i] == nowval + gap)
			{
				i++;
				nowval = list[i];
			}
			else 
			{
				nowval +=gap;				
			}
		}
		
	}
}
