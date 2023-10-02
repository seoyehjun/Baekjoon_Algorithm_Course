package baek_14215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeTri 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] line = new int[3];
		
		int maxlen =0;
		int maxidx =0;
		for(int i=0;i<3;i++)
		{
			line[i] = Integer.parseInt(st.nextToken());
			if(line[i]>maxlen)
			{
				maxlen=line[i];
				maxidx= i;
			}
		}
		
		System.out.println("maxlen : "+maxlen);
		System.out.println("maxidx : "+maxidx);
		
		for(int i=0;i<2;i++)
		{
			for(int j=i+1;j<line.length;j++)
			{
				if(i==maxidx ||j==maxidx)continue;
				if(maxlen == line[i]+line[j] || maxlen > line[i]+line[j])
				{
					line[maxidx]=line[i]+line[j]-1;
				}
			}
		}
		
		int result =0;
		for(int i=0;i<line.length;i++)
		{
			result +=line[i];
		}
		System.out.println(result);
	}
}
