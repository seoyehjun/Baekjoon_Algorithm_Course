package baek_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Findchar 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		//System.out.print(S);
		for(int i='a';i<='z' ;i++)
		{
			System.out.print(S.indexOf(i)+" ");
			
		}
	}
}
