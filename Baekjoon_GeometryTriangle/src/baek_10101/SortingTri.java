package baek_10101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortingTri 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] angle = {0,0,0};
		
		int tot=0;
		for(int i=0;i<3;i++)
		{
			angle[i] = Integer.parseInt(br.readLine());
			tot+= angle[i];
		}
		int same_count =0;
		for(int i=0;i<2;i++)
		{
			for(int j=i+1;j<angle.length;j++)
			{
				if(angle[i]==angle[j])same_count++;
			}
		}
		if(same_count==3 && tot==180)//모든변이 같은경우
			System.out.println("Equilateral");
		else if(same_count==1 && tot==180)
			System.out.println("Isosceles");
		else if(same_count==0 && tot==180)
			System.out.println("Scalene");
			
		
		if(tot != 180)
			System.out.println("Error");
		
	}
}
