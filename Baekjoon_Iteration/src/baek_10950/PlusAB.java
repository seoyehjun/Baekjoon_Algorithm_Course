package baek_10950;

import java.util.Scanner;

public class PlusAB 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		int[][] var = new int[count][2];
		
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<2;j++)
			{
				var[i][j] = sc.nextInt();
			}
		}

		/*for(int i=0;i<count;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.printf("var[%d][%d]: %d \n",i,j,var[i][j]);
			}
		}*/
		
		for(int i=0;i<count;i++)
		{
			System.out.println(var[i][0]+var[i][1]);
		}
	}
}
