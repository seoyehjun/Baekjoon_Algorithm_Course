package baek_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Parenthesis 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp;
		StringTokenizer st;
		int count = Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++)
		{
		    int val_check=0;
		    
			temp = br.readLine();
			
			for(int j=0;j<temp.length();j++)
			{
				if(temp.charAt(j)=='(')
				{
					val_check++;
				}
				else if(temp.charAt(j)==')')
				{
					val_check--;
				}
				if(val_check<0)break;
			}
			if(val_check==0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
