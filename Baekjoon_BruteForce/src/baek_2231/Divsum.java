package baek_2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divsum 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long input = Integer.parseInt(br.readLine());
		
	
		//각 자릿수 구하기;
		int f1;
		int f2;
		int f3;
		int f4;
		int f5;
		int f6;
		long candidate;
		
		//반복문으로 생성자 찾기(작은생성자 나오면 그냥 끝낸다)
		long result=0;
		for(long i=0; i< input;i++)
		{
			candidate = i;
			
			//각 자릿수 구하기;
			f1 = (int)(candidate%10);
			candidate /= 10;
		    f2 = (int)(candidate%10);
			candidate /= 10;
			f3 = (int)(candidate%10);
			candidate /= 10;
			f4 = (int)(candidate%10);
			candidate /= 10;
			f5 = (int)(candidate%10);
			candidate /= 10;
			f6 = (int)(candidate%10);
			
			if(i+f1+f2+f3+f4+f5+f6 == input)
			{
				result =i;
				break;
			}
		}
		
		System.out.println(result);
	}
}
