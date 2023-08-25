package baek_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Average 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		double[] list = new double[count];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double max = 0;
		for(int i=0;i<list.length;i++)
		{
			list[i] = Integer.parseInt(st.nextToken());
			
			if(list[i]>max)max = list[i];
		}
		//System.out.println(Arrays.toString(list));
		
		//System.out.println("max : " + max);
		double tot = 0;
		//fake
		for(int i=0;i<list.length;i++)
		{
			//System.out.printf("list[%d] : %f\n",i, list[i]);
			list[i]= (list[i]/max)*100;
			//System.out.printf("list[%d] : %f\n",i, list[i]);
			//System.out.println("max : " + max);
			tot += list[i];
		}
		
		System.out.printf("%f",tot/list.length);
	}
}
