package baek_2580;

import java.util.Scanner;

public class sdcu2
{
    static int count;
    static int board[][];
    static StringBuilder sb;
    public static void main(String args[])
    {
        count =0;
        board = new int[9][9];
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();


        //주어진 스도쿠 판 채우기
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                board[i][j]= sc.nextInt();
                 //System.out.print(board[i][j]+" ");
            }
           // System.out.println();
        }
        fillsdcu(0);

        //유효성 검사 부분이 스도쿠 규칙으로 바뀌었을뿐
        //for문 후보들은? 같은 row에 있지 않은 숫자들
        //0을 만나면 좌,우,네모 유효성 검사시행

        System.out.println(sb);
    }
    public static void fillsdcu(int count)
    {
        System.out.println("count : "+count);
        if(count >=81)
        {
            System.out.println("exit");
            for(int i=0 ; i<9 ; i++)
            {
                for(int j=0 ; j<9 ; j++)
                {
                    sb.append(board[i][j]);
                }
            }
            return;
        }


        for(int i=count/9;i<9;i++)
        {
            for(int j=count%9;j<9;j++)
            {
                if(board[i][j]==0)
                {
                    //System.out.println("board round : ["+i+"]"+"["+j+"]");
                    for(int q=1 ; q<=9 ; q++)
                    {


                        if (isvalid(i, j, q))
                        {
                            System.out.println("board round : ["+i+"]"+"["+j+"]");
                            System.out.println("what is valid value : "+q);
                            board[i][j] = q;
                            fillsdcu(count + 1);
                            board[i][j] = 0;
                        }


                    }
                }
            }
        }
    }

    public static boolean isvalid(int row, int col, int value)
    {
        //System.out.println("isvalid executed");
        for(int q=0;q<9;q++)//x축값 증가시키면서 검사
        {
            if(q == col)continue;
            if(board[row][q] == value) return false;
        }

        for(int q=0;q<9;q++)//y축값 증가시키면서 검사
        {
            if(q == row)continue;
            if(board[q][col] == value) return false;
        }

        int row_start=row/3, row_end=row_start+3;//0-2,3-5/6-8
        int col_start=col/3, col_end=col_start+3;

        //소규모 네모그룹 검사
        for(int i=row_start;i<row_end;i++)
        {
            for(int j=col_start;j<col_end;j++)
            {
                if(board[i][j]==value) return false;
            }
        }
        return true;
    }



}
