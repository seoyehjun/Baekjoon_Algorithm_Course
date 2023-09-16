package baek_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Groupword 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		
		int count =0;
		for(int i=0;i<number;i++)
		{
			String temp;
			if(check(temp = br.readLine()))
			{
				count++;
			}
		}
		System.out.print(count);
	}
	
	public static Boolean check(String str)
	{
		char temp =str.charAt(0);
		char[] char_list = new char[str.length()];
		int count =0;
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					if(j-i>1 && str.charAt(i+1)!=str.charAt(i))return false;
				}
			}	
		}
		return true;
	}
}
