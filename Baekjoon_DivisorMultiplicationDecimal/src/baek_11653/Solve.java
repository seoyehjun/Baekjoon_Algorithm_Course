package baek_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int target = Integer.parseInt(br.readLine());
		
		while(target)
		for(int i=2;i<=target;i++)
		{
			if(target%i==0)
			{
				target /=i;
				System.out.println(i);
			}
			i--;
		}
		
	}
}
