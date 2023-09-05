package baek_3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] list = {1, 1, 2, 2, 2, 8};
		int[] finding = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<6;i++)
		{
			finding[i] = Integer.parseInt(st.nextToken()); 
		}
		
		for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i]-finding[i]+" ");
		}
	}
}
