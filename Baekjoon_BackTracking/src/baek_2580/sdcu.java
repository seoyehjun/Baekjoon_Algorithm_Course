package baek_2580;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sdcu 
{
	public static int[][] cu;
	public static void main(String[] args) throws IOException
	{
		cu = new int[9][9];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i=0 ; i<cu.length ; i++)
		{
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<cu[0].length;j++)
			{
				cu[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0 ; i<cu.length ; i++)
		{
			for(int j=0;j<cu[0].length;j++)
			{
				if(cu[i][j] == 0)
				{
					for(int q=1;q<=9;q++)
					{
						check(i,j,q);						
					}
				}
			}
		}
		
	}
	
	public static boolean check(int y, int x, int value)
	{
		for(int i=0 ; i<9 ; i++)
		{
			if(cu[i][x]== value)
				return false;
		}
		
		for(int i=0 ; i<9 ; i++)
		{
			if(cu[y][i]== value)
				return false;
		}
		
		int sqy = y/3 *3;
		int sqx = x/3 *3;
		
		for(int i=sqy;i<sqy+3;i++)
		{
			for(int j=sqx;j<sqx;j++)
			{
				if(cu[i][j] == value) return false;
			}
		}
		
		return true;

	}
}
