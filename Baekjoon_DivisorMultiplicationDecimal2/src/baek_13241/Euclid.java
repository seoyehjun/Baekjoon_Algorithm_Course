package baek_13241;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Euclid 
{
	public static long euc(long a, long b)
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
	public static long euc2(long a, long b)
	{
		long euc1 = euc(a,b);
		return (a*b)/euc1;
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Integer.parseInt(st.nextToken()),B = Integer.parseInt(st.nextToken());
		
		System.out.println(euc2(A,B));
		
	}
}
