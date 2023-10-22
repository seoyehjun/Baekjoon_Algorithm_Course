package baek_1269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DD 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		int[] B = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
		{
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++)
		{
			B[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(B);
		int count =0;
		for(int i=0;i<N;i++)
		{
			if(Arrays.binarySearch(B, A[i]) >=0)
			{
				//System.out.println( i + ":true" );
				//System.out.println("Arrays.binarySearch(B, A[i]) :"
					//	+ Arrays.binarySearch(B, A[i]) );
				count++;
			}
		}
		
		//System.out.println("A.length: "+A.length);
		//System.out.println("B.length: "+B.length);
		//System.out.println("count: "+count);
		System.out.println(A.length+B.length-count*2);
	}
}
