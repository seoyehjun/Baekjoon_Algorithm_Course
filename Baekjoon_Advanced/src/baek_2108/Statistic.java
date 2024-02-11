package baek_2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Statistic 
{
	public static void main(String[] args) throws IOException
	{
		double san_pawng, jong, bin, range;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] Num_arr = new int[N];
		double tot = 0;
		
		for(int i = 0 ; i<N ; i++)
		{
			Num_arr[i] = Integer.parseInt(br.readLine());
			tot += Num_arr[i];
		}
		
		Arrays.sort(Num_arr);
		
		
		sb.append(Math.round(tot/N)+"\n");
		sb.append(Num_arr[N/2]+"\n");
		sb.append(bin(Num_arr)+"\n");
		sb.append(Num_arr[N-1]- Num_arr[0]+"\n");
		
		System.out.println(sb);
		
	}
	
	public static int bin(int[] arr)
	{
		Queue<Integer> q = new LinkedList<>();
		int temp = 4001;
		int max_value=arr[0];
		
		int temp2_0 = 0;
		int temp2 = 0;//최대 중복수
		
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(temp != arr[i])//다른수 나올경우
			{
				temp = arr[i];
				temp2_0=0;
			}
			else//같은숫자가 다음에 나올경우
			{
				temp2_0++;
				if(temp2_0>temp2)//역대 최댓값 갱신시
				{
					q.clear();
					q.add(arr[i]);//최댓값 변경
					temp2 = temp2_0;
				}
				else if(temp2_0==temp2)//같은 빈도수로 나온최대수
				{
					q.add(arr[i]);
				}
			} 
		}
	
		if(q.isEmpty() && arr.length>1)
		{
			return arr[1];
		}
		else if(q.isEmpty() && arr.length==1)
		{
			return arr[0];
		}
		
		if(q.size()>1)
		{
			q.poll();
			return q.poll();
		}
		else
		{
			return q.poll();
		}
	}
}
