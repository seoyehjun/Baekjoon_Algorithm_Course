package baek_2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugar2 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int max_5 = N/5;
		int max_3 = N/3;
		int result = -1;
		
		cal:
		for(int i=max_5 ; i>=0 ; i--)
		{
			for(int j=max_3 ; j>=0 ; j--)
			{
				if(5*i + 3*j == N)
				{
					result = i+j;
					break cal;//제일 처음나온 조합이 제일 효율적인 방법이다.
				}
			}
		}
		
		System.out.println(result);
		
	}
}
