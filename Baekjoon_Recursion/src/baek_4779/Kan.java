package baek_4779;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kan
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String temp;
        int N, length;
        while((temp = br.readLine())!=null && !temp.isEmpty())
        {
            N = Integer.parseInt(temp);

            length = (int) (Math.pow(3.0, (double) N));

            char[] board = new char[length];// N:2  일시 9반환
            for(int i=0;i<board.length;i++)
            {
                board[i] = '-';
            }
            func(board,N-1,0);


            sb.append(board);

            sb.append("\n");
        }
        System.out.println(sb);

    }

    public static void func(char[] board, int N, int start)
    {
        //System.out.println("N: "+N);
        int pow3 = (int)Math.pow((double)3,(double)N);
        //System.out.println("3의제곱은?: "+pow3);
        for(int i=start+pow3 ; i<start+pow3*2 ; i++)//N에 0이 들어간다면? == 인덱스 1부터 시작
        {
            board[i] = ' ';
        }
        if(N==0 ||N<0) return;


        func(board, N-1,start);
        func(board, N-1, start + pow3*2);
    }
}