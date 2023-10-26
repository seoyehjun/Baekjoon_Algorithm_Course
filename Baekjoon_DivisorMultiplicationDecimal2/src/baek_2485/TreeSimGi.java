package baek_2485;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TreeSimGi
{
	public static int euc(int a, int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return euc(b,a%b);
		}
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] list = new int[N];
		
		for(int i=0;i<N;i++)
		{
			list[i] = Integer.parseInt(br.readLine());
		}
		
		int round_euc=list[1]-list[0];
		
		for(int i=2;i<N;i++)
		{
			//System.out.println("list[i-1]: "+list[i-1]);
			//System.out.println("list[i]: " +list[i]);
			
			round_euc = euc(round_euc,list[i]-list[i-1]);
		}
		
		int count =0;
		
		//System.out.println("round_euc: "+round_euc);
		for(int i=1;i<N;i++)
		{
			//System.out.println("list[i]-list[i-1]: "+(list[i]-list[i-1]));
			count += (list[i]-list[i-1])/round_euc-1;
		}
		
		
		System.out.println(count);
	}
}
