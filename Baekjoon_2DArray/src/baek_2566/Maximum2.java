package baek_2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maximum2 
{
	public static void main(String[] args) throws IOException
	{
		int[][] board = new int[9][9];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		
		int maxvalue = 0;
		int max_y=0, max_x=0;
		
		for(int i=0;i<9;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<9;j++)
			{
				int temp = Integer.parseInt(st.nextToken());
			
				if(maxvalue < temp)
				{
					maxvalue = temp;
					max_y = i; 
					max_x = j;
				}
				
			}
			
		}
		
		sb.append(maxvalue+"\n");
		sb.append( (max_y+1) + " " + (max_x+1));
		
		System.out.println(sb);
		
		
	}
}
