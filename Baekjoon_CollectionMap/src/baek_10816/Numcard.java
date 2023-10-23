package baek_10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Numcard 
{
	public static void main(String[] args) throws IOException
	{
		HashMap<Integer, Integer> map = new HashMap();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int roundInt;
		for(int i=0;i<N;i++)
		{
			roundInt = Integer.parseInt(st.nextToken());
			if(map.containsKey(roundInt))
			{
				map.put(roundInt, map.get(roundInt)+1);
			}
			else
			{
				map.put(roundInt, 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		Integer temp;
		for(int i=0;i<M;i++)
		{
			temp = map.get(Integer.parseInt(st.nextToken()));
			if(temp != null )
			{
				sb.append(temp+" ");
			}
			else
			{
				sb.append(0+" ");
			}
		}
		System.out.println(sb);
	}
}
