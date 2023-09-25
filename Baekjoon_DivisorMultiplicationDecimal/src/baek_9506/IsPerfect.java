package baek_9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPerfect 
{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp ="";
		while(!(temp = br.readLine()).equals("-1"))
		{
			printResult(Integer.parseInt(temp));
		}
	}
	
	
	public static void printResult(int target)
	{
		int[] divisors = new int[target/2];
		int index_counter =0;
		int divisors_sum =0;
		
		for(int i=1;i<target;i++)
		{
			if(target%i==0)
			{
				divisors[index_counter++]= i;
				divisors_sum += i;
			}
		}
		
		if(divisors_sum ==target)
		{
			System.out.print(target+" = ");
			System.out.print(divisors[0]);//모양 맞추기 위해 첫번째약수(1)은 반복문 이전에 출력
			for(int i=1;i<index_counter;i++)
			{
				System.out.print(" + " + divisors[i]);
			}
			System.out.println();
		}
		else
		{
			System.out.println(target + " is NOT perfect.");
		}
	}
}
