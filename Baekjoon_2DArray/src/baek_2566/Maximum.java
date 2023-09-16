package baek_2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maximum 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] num_arr = new int[9][9];

		int max=0, max_x = 0, max_y = 0;//최댓값과 그 인덱스를 저장할 변수
		for(int i=0 ; i<9 ; i++)
		{
			st = new StringTokenizer(br.readLine());
			for(int j=0 ; j<9 ; j++)
			{
				num_arr[i][j] = Integer.parseInt(st.nextToken());
				if(num_arr[i][j]>max) 
				{
					max = num_arr[i][j]; //최댓값 구하기
					max_y = i;
					max_x = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((max_y+1) + " " + (max_x+1));
		
	}
	
}
