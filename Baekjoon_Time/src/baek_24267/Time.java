package baek_24267;

import java.util.Scanner;

public class Time 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		int count =0;
		for(int i=0;i<=n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					count++;
				}
				
			}
		}
		
		System.out.println(count);
		System.out.println("3");
	}
}
