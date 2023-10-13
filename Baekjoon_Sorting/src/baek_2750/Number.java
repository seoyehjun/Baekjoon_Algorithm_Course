package baek_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number 
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
		
		int count = Integer.parseInt(br.readLine());
		int nowidx=0;
		int[] list = new int[count];
		
		for(int i=0;i<count;i++)
		{
			list[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<count;i++)
		{
			int round_min=9999;
			int round_minidx=i;
			for(int j=i ;j<count;j++)
			{
				if(list[j]<round_min)
				{
					round_min = list[j];
					round_minidx=j;
				}	
			}swap(list,i,round_minidx);
		}
		
		for(int i=0;i<count;i++)
		{
			System.out.println(list[i]);
		}
		
	}
}
