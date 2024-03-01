package baek_15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM2 
{
	static int list[];
	static boolean checked[];
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		checked = new boolean[N+1];
		list = new int[M+1];
		
		maker(N, M, 1,1);
	}
	
	public static void maker(int N, int M, int depth, int start)
	{
		if(depth == M+1)
		{
			for(int i=1;i<list.length;i++)
			{
				System.out.print(list[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=start;i<=N;i++)
		{
			if(!checked[i])//체크 안되어있을때
			{
				list[depth] = i;
				checked[i] = true;
				maker(N, M, depth+1,i+1);
				
				checked[i] = false;
			}
		}
		
		
	}
}
