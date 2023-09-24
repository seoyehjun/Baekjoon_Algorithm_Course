package baek_5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MulitpleDivisor 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String temp="";
		while(!(temp = br.readLine()).equals("0 0"))
		{
			st =  new StringTokenizer(temp);
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			//System.out.println("first: "+ first);
			//System.out.println("second: "+ second);
			
			if(first%second == 0)
				System.out.println("multiple");
			else if(second%first == 0)
				System.out.println("factor");
			else
				System.out.println("neither");
		}
	}
}
