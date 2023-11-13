package baek_24723;

import java.util.Scanner;

public class GBT 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int next_round=1;
		for(int i=0;i<N;i++)
		{			
			next_round *=2;
		}
		System.out.println(next_round);
	}
}
