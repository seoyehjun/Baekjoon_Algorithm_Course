package baek_27433;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial2 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if(n==0)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(recur(n));
		}
		
	}
	
	public static long recur(long n)
	{
		
		long result=n;
		
		if(n > 1)
		{
			result *= recur(n-1);
		}
		
		return result;
	}
}
