package baek_19532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Equation 
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
			
		int node11, node12;
		int node21,	node22;
		int result1, result2;
		
		node11 = Integer.parseInt(st.nextToken());
		node21 = Integer.parseInt(st.nextToken());
		result1 = Integer.parseInt(st.nextToken());
		node12 = Integer.parseInt(st.nextToken());
		node22 = Integer.parseInt(st.nextToken());
		result2 = Integer.parseInt(st.nextToken());
		
		
		int x=0,y=0;
		for(int i=-999 ; i<=999 ; i++)
		{
			for(int j=-999 ; j<=999 ; j++)
			{
				if(node11*i+node21*j==result1 && node12*i+node22*j==result2)
				{
					x = i;
					y = j;
					break;
				}
			}
		}
		
		System.out.println(x + " " + y);
	}
	
}
