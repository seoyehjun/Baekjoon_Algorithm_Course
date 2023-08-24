package baek_10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Changeball
{
	public static <T> void swap(int[] list, int a, int b)
	{
		int temp;
		temp = list[a];
		list[a] = list[b];
		list[b] = temp;
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int len =Integer.parseInt(st.nextToken()), num = Integer.parseInt(st.nextToken());
		
		int[] list = new int[len];
		for(int i=0;i<len;i++)
		{
			list[i] =i+1;
		}
		
		int idx1,idx2;
		for(int i=0;i<num;i++)
		{
			st = new StringTokenizer(br.readLine());
			idx1 = Integer.parseInt(st.nextToken())-1;
			idx2 = Integer.parseInt(st.nextToken())-1;
			
			swap(list,idx1,idx2);
		}
		
		for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i] + " ");
		}
	}
}
