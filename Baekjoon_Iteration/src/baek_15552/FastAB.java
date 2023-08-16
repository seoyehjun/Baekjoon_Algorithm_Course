package baek_15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FastAB 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++)
		{
			st = new StringTokenizer(br.readLine());
			//st에 담는 이유는 " "기준으로 분리해서 받기 위해서?
			bw.write((Integer.parseInt(st.nextToken()))+(Integer.parseInt(st.nextToken()))+"\n");
			//bw.write의 매개변수에 +문자열을 해서 문자열 형식으로 바꾸어 주어야 한다.
			System.out.println("test");
		}
		
		//bw.close();
		
	}
}
