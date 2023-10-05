package baek_24266;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long input = Long.parseLong(br.readLine());
		
		System.out.println((long)Math.pow(input,3));//Math.pow를 사용하면 안된다
		//double형은 부동소수점 연산을 한다는걸 염두해두자
		//System.out.println(input*input*input);
		System.out.println("3");
		
	}
}
