package baek_11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChangeExpress 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		int expr = Integer.parseInt(st.nextToken());
		
		String result = "";
		while(num>=expr)
		{
			int temp=(num%expr);
			
			if(temp>=10)
			{
				result = (char)(temp+55) + result;
			}
			else
			{
				result = temp + result;
			}
			num /= expr;
		}
		if(num>=10)
		{
			result = (char)(num+55) + result;
		}
		else
		{
			result = num + result;
		}
		System.out.println(result);
	}
}
