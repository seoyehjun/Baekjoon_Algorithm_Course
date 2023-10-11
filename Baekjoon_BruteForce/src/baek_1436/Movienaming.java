package baek_1436;

import java.util.Scanner;

public class Movienaming
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int count=1;
		
		for(int i=0;i<=2;i++)
		{
			
			String temp="666";
			for(int alpa=1;alpa<(int)Math.pow(10, i);alpa++)
			{
				System.out.println(Math.pow(10, i));
				
				for(int j=(int)Math.pow(10, i-1)-1;j<=Math.pow(10,i)-1;j++)
				{
					temp ="666";
					temp = alpa+temp+j;
					System.out.println(temp);
				}
			}
			
			System.out.println(temp);
			System.out.println("------------------------");
			
		}
	}
}
