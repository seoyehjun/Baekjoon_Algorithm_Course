package baek_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maximum 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int[] list = new int[9];
		
		for(int i=0;i<list.length;i++)
		{
			list[i] = Integer.parseInt(br.readLine());
		}
		
		int maxidx=0;
		int maxvalue=0;
		for(int i=0;i<list.length;i++)
		{
			if(list[i]>maxvalue)
			{	
				maxvalue=list[i];
				maxidx =i;
			}
		}
		System.out.println(maxvalue);
		System.out.println(maxidx+1);
	}
}
