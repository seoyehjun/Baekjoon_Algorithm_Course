package baek_10814;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AgeNamesorting 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[][] list = new String[N][2];
		
		StringTokenizer st;
		for(int i=0; i<N ;i ++)
		{
			st = new StringTokenizer(br.readLine());
			list[i][0] = st.nextToken();
			list[i][1] = st.nextToken();
		}
		
		
		Arrays.sort(list,(e1,e2) ->{
			return Integer.parseInt(e1[0])- Integer.parseInt(e2[0]);
		});
		
		for(int i=0;i<N;i++)
		{
			bw.append(list[i][0] + " " + list[i][1]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
