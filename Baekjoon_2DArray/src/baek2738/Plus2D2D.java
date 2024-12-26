package baek2738;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Plus2D2D 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                     )
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n= Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] num_arr1 = new int[n][m];
		int[][] num_arr2 = new int[n][m];
		int[][] output = new int[n][m];
		
		//첫번째 배열
		for(int i=0;i<n;i++)
		{
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++)
			{
				num_arr1[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		//두번째 배열
		for(int i=0;i<n;i++)
		{
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++)
			{
				num_arr2[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		//두 배열의 합계 출력
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				output[i][j] = num_arr1[i][j] + num_arr2[i][j];
				System.out.printf("%d ", output[i][j]);
			}
			System.out.println();
		}
	}
}
