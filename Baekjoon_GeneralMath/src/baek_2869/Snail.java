package baek_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int vel = Integer.parseInt(st.nextToken());
		int gravity = Integer.parseInt(st.nextToken());
		int goal = Integer.parseInt(st.nextToken());
		
		int d_count =0;
		int status =gravity;//반복문 최적화를 위해 떨어지는 
		//높이 미리 더해놓는다. 
		
		do
		{
			status -= gravity;//자는동안 떨어짐
			d_count++;//날수 계산
			
			status += vel;//낮동안 올라감
			
		}while(status<goal);	
		
		System.out.println(d_count);
	}
}
