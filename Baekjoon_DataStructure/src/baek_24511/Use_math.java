package baek_24511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Use_math 
{
	public static void main(String[] args) throws IOException
	{
		Queue<Integer> que = new LinkedList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());//1.자료형 갯수
		int[] requestD = new int[N];
		int[] request = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());//2.(스덱여부)
		for(int i=0;i<N;i++)
		{
			requestD[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());//3.자료형에들어갈 값
		for(int i=0;i<N;i++)
		{
			request[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=N-1;i>=0;i--)
		{
			if(requestD[i]==0)
			{	
				que.add(request[i]);				
			}
		}
		int userN = Integer.parseInt(br.readLine());//4.유저인풋갯수
		st = new StringTokenizer(br.readLine());//5.유저 수열
		for(int i=0;i<userN;i++)
		{
			que.add(Integer.parseInt(st.nextToken()));
		}
		
		
		StringBuilder sb = new StringBuilder();//결과값
		for(int i=0;i<userN;i++)
		{
			sb.append(que.poll()+" ");
		}
		System.out.println(sb);
	}
}
