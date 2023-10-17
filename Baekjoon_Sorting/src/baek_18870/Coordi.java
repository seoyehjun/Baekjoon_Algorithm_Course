package baek_18870;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Coordi 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] input = new int[N];
		int[] indicator = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
		{
			int temp = Integer.parseInt(st.nextToken());
			input[i] = temp;
			indicator[i] = temp;
		}
		
		//입력받은 값을 정렬한다 나중에 indicator의 index가 해당 값의 순서가 된다.
		Arrays.sort(indicator);
		indicator = Arrays.stream(indicator).distinct().toArray(); //중복제거
		
		
		/*ArrayList로 변환후 indexOf로 푸는 방법은 시간복잡도 n^2을 유발하므로 쓰면안된다.
        List<Integer> intList = new ArrayList<>();//배열을 리스트로 바꾸는 코드
        for (int element : indicator) 
        {
            intList.add(element);
        }//원시 자료형이라 하나하나 붙여야 한다.
		*/
		
		
        //
        StringBuilder sb = new StringBuilder();
		int j;
		for(int i=0;i<input.length;i++)
		{
			j = Arrays.binarySearch(indicator, input[i]);
			sb.append(j+" ");
		}
		
		System.out.println(sb);
	}
}
