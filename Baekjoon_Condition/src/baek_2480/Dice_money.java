package baek_2480;

import java.util.Arrays;
import java.util.Scanner;

public class Dice_money {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[3];
		int sort = 0;
		int same_num=0;
		int max;
		int result=0;
		for(int i=0; i<3 ;i++)
		{
			input[i]=sc.nextInt();
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=i+1;j<3;j++)
			{
				if(input[i]==input[j])
					{
						sort++;
						same_num = input[i];
					}
			}
		}
		
		if(sort == 0 )
		{
			max=Arrays.stream(input).max().getAsInt();
			result = max*100;
		}
		else if(sort ==1)
		{
			result = 1000+ same_num*100;
		}
		else if(sort>=2)
		{
			result = 10000 + same_num*1000;
		}
		System.out.print(result);
		
	}
}
