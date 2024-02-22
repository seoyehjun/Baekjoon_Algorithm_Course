package baek_10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibo 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(recur(Integer.parseInt(br.readLine())));
		
	}
  	
	public static long recur(long var)
	{
		if(var == 0 ) return 0;
		if(var == 1 ) return 1;
		
		return recur(var-1) + recur(var-2);
	}
}
