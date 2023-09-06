package baek_10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ispel 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		String input = br.readLine();
		StringBuffer sb = new StringBuffer(input);
		String rinput = sb.reverse().toString();
		
		if(input.equals(rinput))
		{
			System.out.print("1");
		}
		else
		{
			System.out.print("0");			
		}
	}
}
