package baek_1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindNum 
{
	public static void main(String[] args) throws IOException
	{
		int[][] list = new int[1000][1000];
		
		int now_y=0, now_x=0;
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int total_num = Integer.parseInt(br.readLine());
		int count=0;
		char dimension = 'x';
		int dir_y=1, dir_x=-1;
		
		for(int i=0;i<total_num;i++)
		{
			for(int j=0;j<count;j++)
			{
				now_y+=dir_y;
				now_x+=dir_x;
				i++;
				System.out.printf("[y]: %d  [x]: %d \n", now_y,now_x);
			}
			
			if(dimension=='y')
			{
				now_y+=1;
				dimension = 'x';
				i++;
				System.out.printf("[y]: %d  [x]: %d \n", now_y,now_x);
			}
			else//dimension=='x'
			{
				now_x+=1;
				dimension = 'y';
				i++;
				System.out.printf("[y]: %d  [x]: %d \n", now_y,now_x);
			}
			
			//대각선 위쪽방향 or 아랫쪽방향
			//count가 늘어남으로 대각선의 길이도 점점 늘어남
			dir_y*=-1;
			dir_x*=-1;
			count++;
		}
		
		System.out.println((now_y)+"/"+(now_x));
	}
}
