package baek_10951;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class PlusAB 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		String temp;
		
		while((temp = br.readLine())!=null)
		{
			st = new StringTokenizer(temp);
			
			bw.write((Integer.parseInt(st.nextToken())) + (Integer.parseInt(st.nextToken()))+"\n");
		}
		
		bw.close();
	}
	
}
