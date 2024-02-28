package baek_15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM 
{
	static boolean[] checked;
	static int[] list;
	
	public static void main(String[] args) throws IOException
	{
		int N, M;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		checked = new boolean[N+1];
		list = new int[M+1];
		
		dfs(N, M, 1 );
	}
	
	public static void dfs(int N, int M, int depth)
	{
		if(depth == M+1)//원하는 깊이까지 삽입한 다음 평가되는 길이
		{
			for(int i=1;i<list.length;i++)
			{
				System.out.print(list[i]+" ");
			}
			System.out.println();
			return;//해당 깊이가 끝남
		}
		
		for(int i=1;i<=N; i++)
		{
			if(!checked[i]) // 해당i(숫자)가 할당되지 않았다면
			{
				checked[i] = true;
				list[depth] = i;
				dfs(N, M, depth+1);
				
				checked[i] = false;//해당 깊이가 끝났음으로 방문기록 초기화
			}
		}
		
		return;
	}
}
