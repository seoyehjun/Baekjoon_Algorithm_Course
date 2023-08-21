package baek_2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Starprint {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++)
		{
			for(int j=num-1;j>i;j--)
			{
				System.out.print(" ");				
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}