package baek_10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Numcard 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		int[] input = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
		{
			input[i] = Integer.parseInt(st.nextToken());
		}
		int[] result =mergesort(input);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int finder;
		StringBuilder sb =new StringBuilder();
		for(int i=0;i<M;i++)
		{
			finder = Integer.parseInt(st.nextToken());
			if(BinarySearch(result, finder)!=-1)
			{
				sb.append(1+" ");
			}
			else
			{
				sb.append(0+" ");
			}
		}	
		System.out.println(sb);
		
		
	}
	
	private static int BinarySearch(int[] arr, int target)
	{
		int left =0;
		int right= arr.length-1;
		int mid;
		
		while(right>=left)//left right같을때가 target값을 찾을때이다. 
		{
			mid= (left+right)/2;
			/*System.out.printf("arr[left]: %d   arr[mid]: %d   arr[right]: %d", arr[left],arr[mid],arr[right]);
			System.out.println();*/
			if(target>arr[mid])
			{
				left= mid+1;
			}
			else if(target<arr[mid])
			{
				right = mid-1;
			}
			else//(target==arr[mid])
			{
				return mid;
			}
		}
		return -1;
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
			if(low_arr[idx1]<high_arr[idx2])
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
