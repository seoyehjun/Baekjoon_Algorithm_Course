package baek_10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Numcard_hash 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n= Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
		{
			map.put(st.nextToken(), 0);
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<m;i++)
		{
			if(map.get(st.nextToken())!=null)
			{
				sb.append("1 ");
			}
			else
			{
				sb.append("0 ");
			}
		}
		
		System.out.println(sb);
	}
}
