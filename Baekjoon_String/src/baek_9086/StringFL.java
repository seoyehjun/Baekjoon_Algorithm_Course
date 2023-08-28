package baek_9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringFL 
{
	public static void main(String[] args) throws IOException
	{ 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); 
		String string;
		StringTokenizer st;
		
		for(int i=0;i<num;i++)
		{
			st = new StringTokenizer(br.readLine());
			string = st.nextToken();
			System.out.print(string.charAt(0));			//char는 +연산하면 안됨(숫자가 된다)
			System.out.print(string.charAt(string.length()-1));
			System.out.println();
		}
		
		
	}
}
