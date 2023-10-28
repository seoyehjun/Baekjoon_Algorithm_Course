package baek_4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Gonjun 
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] list = new boolean[300000];
		Arrays.fill(list, true);
		String str;
		StringBuilder sb = new StringBuilder();
		
		while(!(str = br.readLine()).equals("0"))
		{
			int input = Integer.parseInt(str);
			int count =0;
			for(int i=2;i<=input*2;i++)//2부터 시작해야한다(input이아니라)
			{
				if(list[i])//해당 숫자가 소수이면 배수는 소수가 아니다!
				{
					for(int j= i+i;j<=input*2;j+=i)
					{
						list[j] = false;
					}
				}
			}
			for(int i = input+1;i <= input*2;i++)
			{
				if(list[i]&&i!=1)
					count++;
			}sb.append(count+"\n");
		}
		
		
		System.out.println(sb);
		
		
	}
}
