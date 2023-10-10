package baek_1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chessboard 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N= Integer.parseInt(st.nextToken()); //y
		int M = Integer.parseInt(st.nextToken()); //x
		char[][] board = new char[N][M];
		
		for(int i=0;i<N;i++)
		{
			String temp = br.readLine();
			for(int j=0;j<M;j++)
			{
				board[i][j] = temp.charAt(j);
			}
		}
		
		int min_count =32;
		for(int i=0;i<=N-8;i++)//y축
		{
			for(int j=0;j<=M-8;j++)//x축
			{
				int temp_count=0;
				//여기서부터 보드하나 검사
				int ycount=0;
				char dontsame = board[i][j]; 
				
				
				
				int case2 =1;
				while(case2<=2)
				{
					temp_count =0;
					if(case2==1)
					{
						if(board[i][j]=='B')dontsame='W';
						else if(board[i][j]=='W') dontsame='B';
					}
					else if(case2==2)
					{
						if(board[i][j]=='B')dontsame='B';
						else if(board[i][j]=='W') dontsame='W';
					}
					case2++;
					
					for(int p=i;p<i+8;p++)
					{
						for(int q=j;q<j+8;q++)
						{
							//System.out.printf("board[%d][%d]: %c\n",p,q, board[p][q]);
							//System.out.printf("dontsame: %c\n", dontsame);
							if(board[p][q]==dontsame)
							{	
								temp_count++;
							}
							if(dontsame =='B')dontsame='W';
							else if(dontsame =='W')dontsame='B';
						}
						if(dontsame =='B')dontsame='W';
						else if(dontsame =='W')dontsame='B';
					}
					//System.out.println("-----------------------temp_count :" + temp_count);
				
					if(temp_count<min_count) 
					{
						min_count = temp_count;
						//System.out.println("======================================temp_count: "+temp_count);
					}
				}
			}
		}
		System.out.println(min_count);
	}
}
