package baek_1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mlength 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int nowX = Integer.parseInt(st.nextToken());
		int nowY = Integer.parseInt(st.nextToken());
		
		int lenX = Integer.parseInt(st.nextToken());
		int lenY = Integer.parseInt(st.nextToken());
		
		int result = nowX;
		
		if(nowY < nowX)
			result = nowX;
		
		if((lenX-nowX)<result)
			result = lenX-nowX;
		
		if((lenY-nowY)<result)
			result = lenY-nowY;
		
		System.out.println(result);
	}
}
