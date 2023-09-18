package baek_2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChangeExpress
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );
		
		int result = Stringtoint(st.nextToken(),Integer.parseInt(st.nextToken()));
		System.out.println(result);
				
		
	}
	
	static int Stringtoint(String str, int expression)
	{
		int tot=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>57) //알파벳이 왔을때
			{
				tot += (str.charAt(i)-55)*Math.pow(expression, str.length()-i-1);
			}
			else
			{
				tot += (str.charAt(i)-48)*Math.pow(expression, str.length()-i-1);
			}
		}
		return tot;
	}
}