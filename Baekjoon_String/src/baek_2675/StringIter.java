package baek_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringIter
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String[] list = new String[num];

		
		int count;
		StringTokenizer st;
		
		for(int i=0;i<num;i++)
		{
			st = new StringTokenizer(br.readLine());
			count = Integer.parseInt(st.nextToken());
			list[i] = st.nextToken();
			String temp ="";
			
			for(int j=0;j<list[i].length();j++)
			{
				for(int q=0;q<count;q++)
				{
					temp = temp + (String.valueOf(list[i].charAt(j)));
				}
			}
			
			list[i] = temp;
		}

		for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i]);
			System.out.println();
		}
		
	}
}
