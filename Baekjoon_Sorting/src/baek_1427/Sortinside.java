package baek_1427;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Sortinside 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String N = br.readLine();
		int[] list = new int[N.length()];
		
		
		for(int i=0;i<N.length();i++)
		{
			list[i] = N.charAt(i);
			//System.out.println(i+":"+N.charAt(i));
		}
		
		list = mergesort(list);
		
		for(int i=0;i<N.length();i++)
		{
			bw.write(list[i]);
		}
		bw.flush();
		bw.close();
		
	}
	
	public static int[] mergesort(int[] arr)
	{
		if(arr.length<2)return arr;//재귀 종료
		
		int mid = (arr.length)/2;
		//원소가 2개 남았을때 0인덱스와 1인덱스 배열이 각각 하나씩 생성되고 재귀호출후 바로 리턴
		int[] low_arr = mergesort(Arrays.copyOfRange(arr,0,mid));//0<= && <mid
		int[] high_arr = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
		int[] result_arr = new int[arr.length];
		int idx0=0, idx1=0, idx2=0;
		
		while(idx1<low_arr.length&& idx2<high_arr.length)
		{
			//각각 소배열의 인덱스가 가르키는 배열요소끼리 비교
			if(low_arr[idx1]>high_arr[idx2])
			{
				result_arr[idx0++] = low_arr[idx1++]; 
			}
			else
			{
				result_arr[idx0++] = high_arr[idx2++];
			}
		}
		
		while(idx1<low_arr.length)
		{
			result_arr[idx0++] = low_arr[idx1++];
		}
		while(idx2<high_arr.length)
		{
			result_arr[idx0++] = high_arr[idx2++];
		}
		return result_arr;
	}
	
}
