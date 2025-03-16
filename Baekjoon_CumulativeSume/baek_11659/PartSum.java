package baek_11659;

import java.util.Scanner;

public class PartSum
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] num_set = new int[N];
        int[] sub_tot = new int[N]; //누적합
        int[] result = new int[M]; //결과 저장용 배열
        for(int i=0;i<N;i++)
        {
            num_set[i] = sc.nextInt();
        }

        sub_tot[0] = num_set[0];
        for(int i=1;i<N;i++)
        {
            sub_tot[i] += sub_tot[i-1];
            sub_tot[i] += num_set[i];
        }

        for(int i=0;i<M;i++)
        {
            int start = sc.nextInt();
            int end = sc.nextInt();
            if(start>=2)
            {
                result[i] = sub_tot[end-1] - sub_tot[start-2];
            }
            else
            {
                result[i] = sub_tot[end-1];
            }
            System.out.println(result[i]);
        }

    }
}
