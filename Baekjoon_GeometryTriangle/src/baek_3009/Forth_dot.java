package baek_3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Forth_dot 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		int[] x_list = {0, 0, 0};
		int[] y_list = {0, 0, 0};
		
		int result_x=0,result_y=0;
		
		/*int idx=0;
		String temp="";
		temp = br.readLine();
		do
		{
			st = new StringTokenizer(temp);
			
			x_list[idx] = Integer.parseInt(st.nextToken());
			y_list[idx] = Integer.parseInt(st.nextToken());
			
			++idx;
		}while(!(temp = br.readLine()).equals(""));
		*/
		
		for(int i=0;i<3;i++)
		{
			st = new StringTokenizer(br.readLine());
			x_list[i]= Integer.parseInt(st.nextToken());
			y_list[i]= Integer.parseInt(st.nextToken());
		}
		
		if(x_list[0]==x_list[1])
			result_x = x_list[2];
		if(x_list[0]==x_list[2])
			result_x = x_list[1];
		if(x_list[1]==x_list[2])
			result_x = x_list[0];
		
		if(y_list[0]==y_list[1])
			result_y = y_list[2];
		if(y_list[0]==y_list[2])
			result_y = y_list[1];
		if(y_list[1]==y_list[2])
			result_y = y_list[0];
		
		System.out.println(result_x+" "+result_y);
		
	}
}
