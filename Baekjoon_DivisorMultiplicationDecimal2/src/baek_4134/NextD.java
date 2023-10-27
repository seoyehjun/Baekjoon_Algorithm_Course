package baek_4134;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextD 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<=N;i++)
		{
			long n = Long.parseLong(br.readLine());//현재 대상 숫자
			long RT=n;
			boolean isD = false;
			while(!isD)
			{
				isD = true;
				for(long j=2;j<=Math.sqrt(RT);j++)
				{
					if(RT%j==0)
					{
						isD = false;
						break;
					}
				}
				if(RT == 1 ||RT == 0) isD=false;
				if(isD)//소수이면
				{
					sb.append(RT+"\n");
					break;//대상 숫자 소수판별 끝 
				}
				RT+=1;
			}
		}
		System.out.println(sb);
	}
}
