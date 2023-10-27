package baek_1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindD 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ran1 = Integer.parseInt(st.nextToken()), ran2 = Integer.parseInt(st.nextToken());
		boolean list[] = new boolean[1000001];
		Arrays.fill(list, true);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 2 ; i <= ran2 ; i++)
		{
			if(list[i])//i 값이 소수일때
			{
				for(int j=i+i; j<=list.length-1;j+=i)
				{
					list[j] = false;
				}
			}
			
			if(list[i] && i >= ran1)
			{
				sb.append(i + "\n");
			}
		}
		
		System.out.println(sb);
	}
}
