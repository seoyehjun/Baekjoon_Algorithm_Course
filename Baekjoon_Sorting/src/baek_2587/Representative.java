package baek_2587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Representative 
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
		int[] list = new int[5];
		
		int tot=0;
		for(int i=0;i<5;i++)
		{
			list[i] = Integer.parseInt(br.readLine());
			tot += list[i];
		}
		
		for(int i=0;i<5;i++)
		{
			int temp_min =101;
			int temp_min_idx=i;
			for(int j=i;j<5;j++)
			{
				//System.out.printf("list[%d]: %d\n",j,list[j]);
				//System.out.printf("temp_min: %d\n",temp_min);
				//System.out.println();
				if(list[j]<temp_min)
				{
					temp_min = list[j];
					temp_min_idx = j;
				}
				
			}swap(list,i,temp_min_idx);
			//System.out.println("one cycle min: " + temp_min);
		}
		
		System.out.println(tot/5);
		System.out.println(list[2]);
	}
}
