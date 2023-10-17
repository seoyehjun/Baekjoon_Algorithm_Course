//Thanks to
//https://sookr5416.tistory.com/244?category=521753(개념)
//https://jeonyeohun.tistory.com/103(구현팁)

package baek_10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sorting
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] input = new int[Integer.parseInt(br.readLine())];
		int[] counting = new int[10001];
		int[] result = new int[input.length];
		
		int temp=0;
		for(int i=0;i<input.length;i++)
		{
			temp = Integer.parseInt(br.readLine());
			input[i] = temp;
			counting[temp]++;
		}
		
		//counting 배열 누적합 만들기
		int subtot=0;
		for(int i=0;i<counting.length;i++)
		{
			subtot += counting[i];
			counting[i] = subtot;
		}
		
		//정렬 ㄱㄱ
		int idx;
		for(int i=input.length-1;i>=0;i--)
		{
			idx = --counting[input[i]];
			result[idx] = input[i];
		}
		
		for(int i=0;i<result.length;i++)
		{
			bw.write(result[i]+"\n");//숫자 출력시 String변환
		}
		bw.flush();
		bw.close();
	}
}