package baek_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bojob 
{
	public static void main(String[] args) throws IOException
	{
		HashMap<String, Integer> map = new HashMap();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String temp;
		for(int i=0;i<N+M;i++)
		{	
			temp = br.readLine();
			if(map.containsKey(temp))
			{
				map.put(temp, map.get(temp)+1);
			}
			else
			{
				map.put(temp, 1);
			}
		}
		
		ArrayList<String> list = new ArrayList();
		for(String key : map.keySet())
		{
			if(map.get(key)==2)
			{
				list.add(key);
			}
		}
		
		list.sort(String.CASE_INSENSITIVE_ORDER);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<list.size();i++)
		{
			sb.append(list.get(i)+"\n");
		}
		System.out.println(list.size());
		System.out.println(sb);
	}
}
