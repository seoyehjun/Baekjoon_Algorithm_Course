package baek_7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Ishere 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, String> history = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		String name, inout;
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			name = st.nextToken();
			inout = st.nextToken();
			
			history.put(name, inout);
		}
		
		List<String> keySet = new ArrayList<>(history.keySet());
		Collections.reverse(keySet);
		Collections.sort(keySet, Comparator.reverseOrder());
		for(String key : keySet)
		{
			if(history.get(key).equals("enter"))
			{
			  System.out.println(key);
			}
		}
		
	}
}
