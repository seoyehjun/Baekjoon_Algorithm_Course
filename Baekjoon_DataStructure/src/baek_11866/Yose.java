package baek_11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Yose
{
	public static void main(String[] args) throws IOException
	{
		//poll - poll - remove
		
		Queue<Integer> que = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int N = Integer.parseInt(st.nextToken());
		int cycle = Integer.parseInt(st.nextToken());
		
		for(int i=1;i<=N;i++)
		{
			que.add(i);//요소가 빠지면 자동적으로 재배열 해줘야 한다. 
		}
		
		
		List<Integer> result = new LinkedList<Integer>();
		int round =1;
		while(true)
		{
			
			List<Integer> nextround = new LinkedList<Integer>();
			while(!que.isEmpty())
			{
				if(round%cycle==0)
				{
					//System.out.println("picked-round:"+round);
					//System.out.println(que.peek());
					result.add(que.poll());				
				}
				else
				{
					//System.out.println("round:"+round);
					//System.out.println(que.peek());
					nextround.add(que.poll());
				}
				round++;
			}
			//System.out.println("nextround.size(): "+nextround.size());
			if(nextround.size()==0)break;//남은 요소 없으면 반복문 종료
			for(int i=0;i<nextround.size();i++)
			{
				que.add(nextround.get(i));
				//System.out.print(que.peek());
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<"+result.get(0));
		for(int i=1;i<result.size();i++)
		{
			sb.append(", " + result.get(i));
		}
		sb.append(">");
		System.out.println(sb);		
	}
}
