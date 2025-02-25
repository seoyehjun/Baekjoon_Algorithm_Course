package baek_12865;

import java.util.Scanner;

public class NapSec
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 물건 총 갯수
        int K = sc.nextInt(); // 무게

        // 두번째 값인 '가치'의 값이 잴 높게 셋팅하라

        int[][] value_map = new int[4][2];

        for(int i=0;i<4;i++)
        {
            value_map[i][0] = sc.nextInt();
            value_map[i][1] = sc.nextInt();
        }

        int[][] sub_tot = new int[N][N];

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                
            }
        }

        sub_tot[]


    }
}
