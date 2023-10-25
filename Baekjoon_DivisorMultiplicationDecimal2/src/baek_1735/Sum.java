package baek_1735;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum 
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
		
		int s1,s2,m1,m2;
		StringTokenizer st = new StringTokenizer(br.readLine());
		s1 = Integer.parseInt(st.nextToken());
		m1 = Integer.parseInt(st.nextToken());
		st= new StringTokenizer(br.readLine());
		s2 = Integer.parseInt(st.nextToken());
		m2 = Integer.parseInt(st.nextToken());
		
		int  ssum = s1*m2 + s2*m1 , msum = m1*m2 ;
		int temp;
		while(euc(msum,ssum)!=1)
		{
			temp = euc(msum,ssum);
			msum /= temp;
			ssum /= temp;
		}
		
		System.out.println(ssum+" "+msum);
	}
}
