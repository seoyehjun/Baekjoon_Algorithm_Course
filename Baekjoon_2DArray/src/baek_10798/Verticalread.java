package baek_10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Verticalread 
{
	public static void main(String[] args) throws IOException
	{
		char[][] list = new char[5][15];
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<15;j++)
			{
				list[i][j] = '@';
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<5;i++)
		{
			String temp = br.readLine();
			for(int j = 0;j<temp.length();j++)
			{
				
				list[i][j] = temp.charAt(j);
			}
		}
		
		//세로읽기 시행부분
		String result ="";
		for(int i=0; i<15;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(list[j][i]!='@')//@는 빈칸을 의미한다. 
				{
					result +=String.valueOf(list[j][i]);
				}
			}
		}
		System.out.print(result);
	}
}
