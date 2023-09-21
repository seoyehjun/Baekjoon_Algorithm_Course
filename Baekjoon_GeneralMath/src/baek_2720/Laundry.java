package baek_2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Laundry 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int casenum = Integer.parseInt(br.readLine());
		int[] caseset = new int[casenum];
		
		for(int i=0 ; i<casenum ; i++)
		{
			caseset[i] = Integer.parseInt(br.readLine());
			System.out.println(change(caseset[i]));
		}
	}
	
	public static String change(int target)
	{
		double temp=target;
		String result="";
		
		result += (int)(temp/25)+" ";
		
		temp = temp % 25;
		result += (int)(temp/10)+" ";
		
		temp = temp % 10;
		result += (int)(temp/5)+" ";
		
		temp = temp % 5;
		result += (int)temp+" ";
		
		return result; 
	}
}
