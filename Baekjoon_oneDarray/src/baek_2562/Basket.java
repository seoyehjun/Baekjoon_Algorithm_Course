package baek_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Basket 
{
	public static void main(String[] args) throws IOException {
		
		int[] list ;
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine()); 
		
		
		int len = Integer.parseInt(st1.nextToken()), 
			num = Integer.parseInt(st1.nextToken());
		
		//배열 초기화 및 기본값 할당.
		list = new int[len];
		Arrays.fill(list, 0);
		/*for(int i=0;i<list.length;i++)
		{
			list[i] =0;
		}*/
		
		StringTokenizer st2 ; 
		
		for(int i=0;i<num;i++)
		{
			st2 = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st2.nextToken()) 
			, end = Integer.parseInt(st2.nextToken())
			, value = Integer.parseInt(st2.nextToken()); 
			
			for(int j=start-1;j<=end-1;j++)
			{
				list[j]=value;
			}
		}
			
		
		for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i]+" ");
		}
		
	}
}
