package baek_8393;

import java.util.Scanner;

public class Allplus {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		int input = sc.nextInt();
		int tot=0;
		
		for(int i=1;i<=input;i++)
		{
			tot += i;
		}
		System.out.print(tot);
	}
}
