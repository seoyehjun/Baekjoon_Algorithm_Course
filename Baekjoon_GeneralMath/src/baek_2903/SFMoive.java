package baek_2903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SFMoive 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cycle = Integer.parseInt(br.readLine());
		int dem = 2;
		
		for(int i=0;i<cycle;i++)
		{
			dem = dem + (dem-1);
		}
		System.out.println(dem*dem);
		
	}
}
