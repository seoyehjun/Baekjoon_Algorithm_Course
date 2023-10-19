package baek_14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class StringSet 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0;i<N;i++)
		{
			map.put(br.readLine(), 1);
		}
		
		String temp;
		int count=0;
		for(int i=0;i<M;i++)
		{
			temp = br.readLine();
			if(map.get(temp)!=null)
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}
