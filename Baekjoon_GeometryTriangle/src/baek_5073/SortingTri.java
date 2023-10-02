package baek_5073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SortingTri 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] line = new int[3];
		
		String temp= "";
		while(!(temp = br.readLine()).equals("0 0 0"))
		{
			st = new StringTokenizer(temp);
			
			line[0] = Integer.parseInt(st.nextToken());
			line[1] = Integer.parseInt(st.nextToken());
			line[2] = Integer.parseInt(st.nextToken());
			int same_count=0;
			
			boolean isvalid =true;
			int temptot=0;
			for(int i=0;i<line.length;i++)
			{
				for(int j=i+1;j<line.length;j++)
				{
					temptot=line[i]+line[j]; 
					if(line[i]==line[j])same_count++;
					for(int q=0;q<line.length;q++)//삼각형의 조건이 아니다(a=b+c)
					{
						if(line[q] ==temptot || line[q]>temptot)isvalid=false;
					}
				}
				
			}
			if(isvalid)
			{
				switch(same_count)
				{
			
				case 0: 
					System.out.println("Scalene");
					break;
				case 1:
					System.out.println("Isosceles");
					break;
				case 3:
					System.out.println("Equilateral");
					break;
				}
			}
			else//삼각형 조건 위반시(a=b+c)
			{
				System.out.println("Invalid");
			}
		}
	}
}
