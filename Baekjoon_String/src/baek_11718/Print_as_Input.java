package baek_11718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Print_as_Input 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] list = new String[100];
		
		String temp;
		int count = 0;
		
		while((temp = br.readLine()) !=null)
		{
			list[count] = temp;
			count++;
		}
		
		for(int i=0;i<list.length;i++)
		{
			if(list[i] == null) break;
			
			System.out.println(list[i]);
		}
	}
}
