package baek_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int target = Integer.parseInt(br.readLine());
		
		int count=1;
		while(count>0)
		{
			count=0;
			
			for(int i=2;i<target;i++)
			{
				if(target%i==0)//약수가 있다면(약수중 제일 작은 약수)
				{
					count++;//소수가 아님을 판별
					target /=i;
					System.out.println(i);
					i--;// 2 2 2 처럼 2로 3번연속 나눌 수 있으니까
				}
			}
		}
		
		if(target !=1)
		{
			System.out.println(target);//1은 출력하지 않는다. 
		}
		
	}
}
