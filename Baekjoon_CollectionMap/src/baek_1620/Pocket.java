package baek_1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Pocket 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, String> map = new HashMap();
		HashMap<String,Integer> map2 = new HashMap();
		String sttemp;
		for(int i=1;i<=N;i++)
		{
			sttemp= br.readLine();
			map.put(i, sttemp);
			map2.put(sttemp, i);
		}
		
		String temp;
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=M;i++)
		{
			temp = br.readLine();
			if(48<=temp.charAt(0)&&temp.charAt(0)<=59)//숫자 주어졌을때
			{
				sb.append(map.get(Integer.parseInt(temp))+"\n");
			}
			else//String주어졌을때
			{
				sb.append(map2.get(temp)+"\n");
			}
		}
		System.out.println(sb);
	}
}
