package baek_26069;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Chong 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		String compare1, compare2;
		
		HashSet<String> danceSet = new HashSet();
		danceSet.add("ChongChong");
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			compare1 = st.nextToken();
			compare2 = st.nextToken();
			
			if(danceSet.contains(compare1) || danceSet.contains(compare2))
			{
				danceSet.add(compare1);
				danceSet.add(compare2);
			}
			
			
		}
		
		br.close();
			
		bw.write(danceSet.size() + "\n");
		bw.flush();
		bw.close();
		
	}
}
