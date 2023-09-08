package baek_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Croatia2 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input_string = br.readLine();
		String[] alpa_set = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(String str : alpa_set)
		{
			input_string = input_string.replaceAll(str, "@");
		}
		System.out.print(input_string.length());
		
	}
}
