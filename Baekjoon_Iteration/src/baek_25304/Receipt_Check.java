package baek_25304;

import java.util.Scanner;


public class Receipt_Check 
{
	public static int sum(int list[][])
	{
		int tot=0;
	
		for (int i=0;i<list.length;i++)
		{
			int temp=1;
			for(int j=0;j<list[i].length;j++)
			{
				temp*=list[i][j];
			}
			tot+=temp;
		}
		return tot;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int tot= sc.nextInt(),kind_count=sc.nextInt();
		int[][] list = new int[kind_count][2];
		
		for(int i =0 ; i<kind_count ; i++)
		{
			for(int j = 0 ; j<2 ; j++)
			{
				list[i][j] = sc.nextInt(); 
			}
		}
		
		if(sum(list)==tot)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
			
		}
		
		
	}
}
