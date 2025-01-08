package baek_9461;

import java.util.Scanner;

public class Pado_seq
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N =0;
        N = sc.nextInt();

        int temp;
        for(int i=0 ; i<N ; i++)
        {
            temp = sc.nextInt();
            System.out.println(pado(temp));
        }
        sc.close();
    }

    public static long pado(int N)
    {
        long arr[] = new long[N+1];

        if(N>=1)
            arr[1] = 1;
        if(N>=2)
            arr[2] = 1;
        if(N>=3)
            arr[3] = 1;
        if(N>=4)
            arr[4] = 2;
        if(N>=5)
            arr[5] = 2;

        if(N>=6)
        {
            for (int i = 6; i <= N; i++) {
                arr[i] = arr[i - 1] + arr[i - 5];//점화식으로 풀어버리기
            }
        }

        return arr[N];
    }
}
