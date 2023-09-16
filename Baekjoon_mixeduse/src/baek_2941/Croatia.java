package baek_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Croatia 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input_string = br.readLine();
		int count =0;
		String[] alpa_set = {"c=","c-","dz=","d-","lj","nj","s=","z="} ;
		
		for(int i=0;i<8;i++)
		{
			count += countChar(input_string,alpa_set[i]);
		}
		
		System.out.print(input_string.length()-count);
	}
	
	public static int countChar(String str, String pat)
	{
		int count = 0;
		
		return (str.length()- str.replace(pat,"").length())/(pat.length());
	}
}
