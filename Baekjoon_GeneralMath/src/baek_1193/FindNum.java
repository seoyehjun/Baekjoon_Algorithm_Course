package baek_1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindNum 
{
	public static void main(String[] args) throws IOException
	{
		int now_y=1, now_x=1;
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int total_num = Integer.parseInt(br.readLine());
		int count=1;
		char dimension = 'x';
		int dir_y=1, dir_x=-1;
		
		for(int i=1;i<total_num;)
		{
			if(dimension=='y')
			{
				now_y+=1;
				dimension = 'x';
				i++;
				//System.out.printf("dimen[y]: %d  [x]: %d count: %d\n", now_y,now_x,count);
			}
			else//dimension=='x'
			{
				now_x+=1;
				dimension = 'y';
				i++;
				//System.out.printf("dimen[y]: %d  [x]: %d count: %d\n", now_y,now_x,count);
			}
			
			if(i>=total_num)break;
			for(int j=1;j<=count;j++)
			{
				now_y+=dir_y;
				now_x+=dir_x;
				i++;
				if(i>=total_num)break;
				//System.out.printf("[y]: %d  [x]: %d count: %d\n", now_y,now_x,count);
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
