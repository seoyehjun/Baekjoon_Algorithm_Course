package baek_1436;

import java.util.Scanner;

public class Movinaming2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int count=1;
		
		for(long i=666;i<10000000;i++)
		{
			String temp = String.valueOf(i);
			
			if(temp.contains("666"))
			{
				if(count==input)
				{
					System.out.println(temp);
					break;					
				}
				count++;
			}
		}
	}
}
