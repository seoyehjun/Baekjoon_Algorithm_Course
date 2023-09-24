package baek_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail_awareTime 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int vel = Integer.parseInt(st.nextToken());
		int gravity = Integer.parseInt(st.nextToken());
		int goal = Integer.parseInt(st.nextToken());	
		
		int plus =0;
		int count = (goal-vel) / (vel-gravity);
		if((goal-vel) % (vel-gravity)>0)
		{
			plus ++;
		}
		System.out.println(count +plus +1 );
	}
}
