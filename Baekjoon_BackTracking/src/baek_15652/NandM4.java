package baek_15652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM4 
{
	static int list[];
	static StringBuilder sb;
	static int N,M;
	public static void main(String[] args) throws IOException 
	{
		sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		list = new int[M+1];
		
		maker(1,1);
		
		System.out.println(sb);
		
	}
	
	public static void maker(int depth, int start)
	{
		if(M+1 == depth)
		{
			for(int i=1;i<list.length;i++)
			{
				sb.append(list[i]+" ");	
			}
			sb.append("\n");
			return;
		}
		
		for(int i=start;i<=N;i++)
		{
			list[depth] = i;
			maker(depth+1, i);
		}
		return;
	}
}
