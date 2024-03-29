package baek_17103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] list = new boolean[1000001];
		Arrays.fill(list, true);
		list[1]=false;
		list[0]=false;
		
		int[] list2 = new int[300000];
		int list2_idx=0;
		for(int i=2;i<= 1000000;i++)
		{
			if(list[i])
			{
				list2[list2_idx++]=i;
				for(int j=i+i;j<=1000000;j+=i )
				{
					list[j]=false;
				}
			}
		}
		//System.out.println("list2[0]:"+list2[0]);
		
		
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num;i++)
		{
			int N = Integer.parseInt(br.readLine());
			int round_result=0;
			for(int j=0;list2[j]<N;j++)
			{
				for(int q=j;list2[q]<N;q++)
				{
					if(list2[j]+list2[q]==N)
					{
						round_result++;
							//System.out.println("j:"+list2[j]+"\nq:"+list2[q]);
					}		
				}
			}
			sb.append(round_result+"\n");
		}
		
		System.out.println(sb);
	}
}