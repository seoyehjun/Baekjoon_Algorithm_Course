package baek_15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM3 
{
	static int[] list;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		list = new int[M+1];
		sb = new StringBuilder();
		maker(N, M, 1,1);
	
		System.out.print(sb);
	}
	
	public static void maker(int N, int M, int depth, int start)
	{
		if(depth == M+1)
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
			maker(N, M, depth+1,start);
		}
		return;
	}
	
}
