package baek_1149;

import java.util.Scanner;

public class RGB_plan
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] price_set = new int[N][3];
        int[][] sub_tot = new int[N][3];//특정한 방향으로

        for(int i=0;i<N;i++)
        {
            price_set[i][0] = sc.nextInt();
            price_set[i][1] = sc.nextInt();
            price_set[i][2] = sc.nextInt();
        }

        sub_tot[0][0] = price_set[0][0];
        sub_tot[0][1] = price_set[0][1];
        sub_tot[0][2] = price_set[0][2];

        for(int i=1;i<N;i++)
        {
            //이전값들이 뭔지 살피기만 하면 수열 조건 만족함
            sub_tot[i][0] = price_set[i][0] + Math.min(sub_tot[i-1][1],sub_tot[i-1][2]);
            sub_tot[i][1] = price_set[i][1] + Math.min(sub_tot[i-1][0],sub_tot[i-1][2]);
            sub_tot[i][2] = price_set[i][2] + Math.min(sub_tot[i-1][0],sub_tot[i-1][1]);
        }

        System.out.println(Math.min(sub_tot[N-1][0],Math.min( sub_tot[N-1][1],sub_tot[N-1][2] ) ) );

    }
}
