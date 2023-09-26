package baek_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindDecimal 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int result=0;
		for(int i=0;i<count;i++)
		{
			int target = Integer.parseInt(st.nextToken());
			
			//약수 갯수 판별하는 반복문
			int count_divisor=0; 
			for(int j=1;j<=target;j++)
			{
				if(target%j==0)count_divisor++;
			}
			if(count_divisor==2) result++;//약수의 갯수가 2개이면소수
		}
		
		System.out.println(result);
	}
}
