package baek_3052;

import java.util.Scanner;

public class Left 
{
	public static int exclusive(int[] list)
	{
		int count = 0;
		int temp;
		for(int i=0;i<list.length;i++)
		{
			temp =0;
			for(int j=i+1;j<list.length;j++)
			{
				//같은값이 하나라도 있으면 temp > 0 
				//되어서 count되지 않는다
				if(list[i]==list[j]) temp++;
			}
			if (temp==0)count ++;
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[10];
		
		for(int i=0;i<list.length;i++)
		{
			list[i] = sc.nextInt() % 42 ;
		}
		
		System.out.print(exclusive(list));
	}
}
