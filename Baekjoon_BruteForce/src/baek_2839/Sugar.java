package baek_2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugar 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		int cycle_5 = input/5;
		int cycle_3 = input/3;
		boolean goout = false;
		
	
		for(int i=cycle_5 ; i>=0 ; i--)
		{
			//System.out.println("executed");
			for(int j=cycle_3; j>=0 ; j--)
			{	
				//System.out.println("inner_executed");
				//System.out.println("5갯수는: "+i +"\n"+"3갯수는: "+j+"\n");
				if(i*5 + j*3 == input)
				{
					System.out.println(i+j);
					
					goout = true;
					break;
				}
			}
			if(goout) break;
		}
		
		//만족하는 조건이 한번도 안나왔다면?
		if(!goout)
			System.out.println(-1);
			
	}
}
