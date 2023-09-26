package baek_2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decimal
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int range_min=Integer.parseInt(br.readLine());
		int range_max=Integer.parseInt(br.readLine());
		
		int sum=0;
		int min_d=-1;
		
		for(int i=range_min;i<=range_max;i++)
		{
			boolean isdecimal = true;
			if(i==1)isdecimal =false;//1은 소수가 아니다.
			
			for(int j=2;j<i;j++)
			{
				
				if(i%j==0 )//소수가 아닐경우(약수가 있는경우)
				{
					isdecimal = false;
					break;
				}
			}
			
			if(isdecimal) sum += i;
			if(min_d==-1 && isdecimal) min_d = i;
		}
		
		if(sum!=0)
			System.out.println(sum);
		
		System.out.println(min_d);
	}
}
