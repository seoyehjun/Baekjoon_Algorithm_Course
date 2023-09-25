package baek_2501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountDivisor
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int multiple = Integer.parseInt(st.nextToken());
		int divisor_count = Integer.parseInt(st.nextToken());
		int result =0;
		
		int count =0;
		for(int i=1;i<=multiple;i++)
		{
			if(multiple%i==0)
			{
				if(divisor_count == ++count)
				{
					result =i;
					break;
				}
			}
		}
		
		System.out.println(result);
	}
}
