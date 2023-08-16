package baek_11021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class PlusABformat 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++)
		{
			st = new StringTokenizer(br.readLine());//버퍼로 한줄 읽어오기
			int temp1=Integer.parseInt(st.nextToken()),
					temp2=Integer.parseInt(st.nextToken());
			bw.write("Case #"+(i+1)+": "+temp1+" + "+temp2+" = "+(temp1+temp2)+"\n");
		}
		bw.close();
	}
}
