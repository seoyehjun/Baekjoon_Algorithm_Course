package baek_25305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cutline 
{
	public static void swap(int[] array, int i1, int i2) 
	{
	    int temp = array[i1];
	    array[i1] = array[i2];
	    array[i2] = temp;        
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int number = Integer.parseInt(st.nextToken());
		int prize_num = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] list = new int[number];
		for(int i=0;i<number;i++)
		{
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<number;i++)
		{
			int temp_min = list[i];
			int temp_min_idx = i;
			for(int j=i;j<number;j++)
			{
				if(list[j]<temp_min)
				{
					temp_min=list[j];
					temp_min_idx =j;
					swap(list, i, j);
				}
			}
		}
		
		/*for(int i=0;i<number;i++)
		{
			System.out.printf("list[%d]: %d",i, list[i]);
		}*/
		
		System.out.println(list[number-prize_num]);
	}
}
