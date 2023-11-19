package baek_1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Yak 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		long[] list = new long[count];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long max =1;
		long min = 1000000;
		for(int i=0;i<count;i++)
		{
			long temp = Long.parseLong(st.nextToken());
			if(temp>max)max = temp;
			if(temp<min)min = temp;
		}
		
		System.out.println(max * min);
	}
}
