package baek_2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HONEY 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int min = 2, max = 7;
		int count =2;
		while(true)
		{
			System.out.println("count: "+count);
			System.out.println("min: "+min);
			System.out.println("max: "+max);
			System.out.println();
			if(num ==1 )
			{
				count = 1;
				break;
			}
			if(num>=min && num<=max)
				break;
			
			min = max +1;
			max = min+(6*count)-1;
			
			count++;
			
			
		}
		
		System.out.println(count);
	}

}
