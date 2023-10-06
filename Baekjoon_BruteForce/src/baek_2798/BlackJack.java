package baek_2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		long cutline = Long.parseLong(st.nextToken());
		
		st= new StringTokenizer(br.readLine());
		
		long[] list = new long[num];//list내의 숫자들은 100,000을 넘지 않는다.
		for(int i=0;i<num;i++)
		{
			list[i] = Long.parseLong(st.nextToken());
		}
		
		long sum=0;
		long result_sum=0;
		int debuf=0;
		for(int i=0;i<num;i++)
		{
			sum +=list[i];
			for(int j=i+1;j<num;j++)
			{
				sum+=list[j];
				for(int q=j+1;q<num;q++)
				{
					sum+=list[q];
					if((cutline-result_sum>cutline-sum) &&sum<=cutline)//현재 합이 컷트라인에 더 가깝다면
					{
						//System.out.println("list[i] : "+list[i]+"\n"+
						//					"list[j] : "+list[j]+"\n"+
						//					"list[q] : "+list[q]);
						result_sum = sum;
					}
					sum-=list[q];
				}
				sum-=list[j];
			}
			sum-=list[i];
		}
		
		System.out.println(result_sum);
	}
}
