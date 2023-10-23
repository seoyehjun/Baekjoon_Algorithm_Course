package baek_1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LCM 
{
	public static void main(String[] args) throws IOException
	{
		int A, B, count;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		count = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<count;i++)
		{
			int result=1;
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			int rotate = 0;
			
			
			for(int j=2;j<=A;j++)
			{
				if( A%j == 0 && B%j == 0 )
				{
					A /= j;
					B /= j;
					result *= j;
					j = 2;//다음 반복문시 3부터 시작
					rotate++;
				}
			}
			
			//System.out.println("A: "+A);
			//System.out.println("B: "+B);
			//System.out.println("rotate: "+rotate);
			result *= A*B;
			sb.append(result + "\n");
		}
		
		System.out.println(sb);
	}
}
