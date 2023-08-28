package baek_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String sum_set = br.readLine();
		int tot = 0;
		
		for(int i=0;i<num;i++)
		{
			tot +=(sum_set.charAt(i) - '0');
			//System.out.println(sum_set.charAt(i));
			//System.out.println("tot: "+tot);
		}
		System.out.print(tot);
	}
}
