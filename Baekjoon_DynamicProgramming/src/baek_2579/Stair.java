package baek_2579;

import java.util.Scanner;

public class Stair
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] stairs = new int[N];

        for(int i=0;i<N;i++)
        {
            stairs[i] = sc.nextInt();
        }

        int[] sub_tot = new int[N];


        //sub_tot에는 무조건 최댓값! 만 저장한다.
        sub_tot[0] = stairs[0];
        if(N>=2)
            sub_tot[1] = stairs[1] + sub_tot[0];
        if(N>=3)
            sub_tot[2] = Math.max(stairs[2] + sub_tot[0], stairs[2] + stairs[1]);

        for(int i=3 ;i<N ;i++ )
        {
            sub_tot[i] = Math.max( stairs[i-1] + sub_tot[i-3] + stairs[i] , sub_tot[i-2] + stairs[i] );
        }
        System.out.println(sub_tot[N-1]);
    }
}
