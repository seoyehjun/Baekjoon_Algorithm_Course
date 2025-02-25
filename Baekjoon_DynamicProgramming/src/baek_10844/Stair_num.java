package baek_10844;

import java.util.Scanner;

public class Stair_num
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[][] sub_tot = new long[N+1][10];

        long limit = 1000000000;


        for(int i = 1 ; i<=9 ;i++)
        {
            sub_tot[1][i] = 1;
        }

        for(int i=2 ; i<=N ; i++)
        {
            for(int j=0 ; j<=9 ;j++)
            {
                if(j<9)
                    sub_tot[i][j] += sub_tot[i-1][j+1];

                if(j>0)
                    sub_tot[i][j] += sub_tot[i-1][j-1];

                sub_tot[i][j] %= limit;
            }
        }

        long result = 0;

        for(int i=0 ; i<=9 ;i++)
        {
            result += sub_tot[N][i];
        }

        result %= limit;

        System.out.println(result);

    }

}
