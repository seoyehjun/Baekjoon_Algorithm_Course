package baek_13909;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class CloseWindow 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/*int[] list = new int[N + 1];
		Arrays.fill(list, -1);//닫힌 상태
		
		for(int i=1;i<list.length;i++)
		{
			for(int j=i ; j<list.length ; j+=i)
			{
				list[j] *= -1;//닫히면 열고, 열려있으면 닫는다
			}
		}
		
		int count=0;
		for(int i=1;i<list.length;i++)
		{
			if(list[i]==1)count++;
		}
		System.out.println(count);
		*/
		int result=0;
		for(int i=1;i*i<=N;i++)
		{
			result =i;
		}
		System.out.println(result);
	}
}
