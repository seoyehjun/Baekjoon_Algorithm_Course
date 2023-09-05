package baek_2444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Printstar 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0;i<count-1;i++) 
		{
			for(int j=i;j<count-1;j++)
			{
				System.out.print(" ");
			}
			for(int q=1;q<(i+1)*2;q++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<count*2-1;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(" ");
			}

			/*for(int q=0;q<(count-i)*2-3;q++)
			{
				System.out.print("*");
			}*/
			int count_star=0;
			for(int q=count*2;q>i*2+3;q--)
			{
				count_star++;
				System.out.print("*");
				//System.out.printf("q: %d   i: %d\n", q,i);
			}
			//System.out.print("count_star : "+count_star+"  i*2+3 : "+(i*2+3));
			System.out.println();
		}
	}
}
