package baek_9063;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Find_land 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		int[] x_list = new int[count];
		int[] y_list = new int[count];
		
		int min_x=100000;
		int min_y=100000;
		int max_x=-100000;
		int max_y=-100000;
		
		StringTokenizer st;
		
		for(int i=0;i<count;i++)
		{
			st= new StringTokenizer(br.readLine());
			x_list[i] = Integer.parseInt(st.nextToken());
			y_list[i] = Integer.parseInt(st.nextToken());
			
			if(x_list[i]<min_x)
				min_x = x_list[i];
			if(y_list[i]<min_y)
				min_y = y_list[i];
			if(x_list[i]>max_x)
				max_x = x_list[i];
			if(y_list[i]>max_y)
				max_y = y_list[i];
		}
		
		
		System.out.printf("min_x : %d\n",min_x);
		System.out.printf("min_y : %d\n",min_y);
		System.out.printf("max_x : %d\n",max_x);
		System.out.printf("max_y : %d\n",max_y);
		
		System.out.println(Math.abs(max_x-min_x)*Math.abs(max_y-min_y));
	}
}
