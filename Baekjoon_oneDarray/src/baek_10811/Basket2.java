package baek_10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Basket2 
{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		
		int[] list = new int[N];
		
		for(int i=0 ; i<list.length;i++)
		{
			list[i] = i+1;
		}
		
		for( int i = 0; i < M ; i++ )
		{
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken())-1,end = Integer.parseInt(st.nextToken())-1;
			//System.out.println("end : " + end); 디버그 코드
			int count =0;
			for(int j=0 ; j < (end-start)/2 + 1 ; j++)
			{
				int temp = list[ start+count ];
				list[ start+count ] = list[ end-count ];
				list[ end-count ] = temp;
				count ++;
			}
			//System.out.println("count : "+count); 디버그 코드
		}
		
		for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i]+" ");
		}
	}
}
