package baek_15652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NandM4 
{
	/*
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

	 */

	static int N;
	static int M;
	static int[] result;
	static int[] num_set;
	static StringBuilder sb;

	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		result = new int[M];
		num_set = new int[N];

		for(int i=0;i<N;i++)
		{
			num_set[i] = i+1;
		}

		bt(0,1);
		System.out.println(sb);

	}

	public static void bt (int idx, int past)//인덱스, 이전에 할당된 값
	{
		if(idx == M)
		{
			if(isvalid())
			{
				for(int i=0;i<result.length;i++)
				{
					sb.append(result[i]+" ");
				}
				sb.append("\n");
			}
			return;
		}

		for(int now=past ; now<=N ; now++)// 모든 구성의 후보셋들 1~N
		{ //비내림차순(오름차순) 이라 뒤에수는 크거나 같은수가 와야한다.
			result[idx] = now;
			bt(idx+1, now);
		}
	}

	public static boolean isvalid()
	{
		int temp;
		for(int i=0 ; i<result.length ; i++)
		{
			for(int j=i ; j<result.length ; j++)
			{
				if(result[j]<result[i])//내림차순이라면 안되니
				{
					return false;//내림차순 감지시 실패 반환
				}
			}
		}
		return true;
	}
}
