package baek_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting_word 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] list = new String[N];
		
		for(int i=0;i<N ;i++)
		{
			list[i] = br.readLine();
		}
		
		Arrays.sort(list,(e1,e2) -> {
				if(e1.length()>e2.length()) return 1;
				else if(e1.length()<e2.length()) return -1;
				
				//문자열 길이 같을때
				for(int i=0;i<e1.length();i++)
				{	
					if(e1.charAt(i)!=e2.charAt(i))	
					{
						return (e1.charAt(i) - e2.charAt(i));
					}
				}
				return 1;
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(list[0]+"\n");
		for(int i=1;i<list.length;i++)
		{
			if(!list[i].equals(list[i-1]))
			{
				sb.append(list[i]+"\n");
			}
		}
		
		System.out.println(sb);
	}
}
