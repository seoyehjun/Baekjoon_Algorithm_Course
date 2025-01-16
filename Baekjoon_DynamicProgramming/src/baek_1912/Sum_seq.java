package baek_1912;

import java.util.Scanner;

public class Sum_seq
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        int[] sub_tot = new int[N];

        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        sub_tot[0] = arr[0];

        int max_tot= sub_tot[0];
        for(int i=1;i<N;i++)
        {
            sub_tot[i] =Math.max(arr[i], sub_tot[i-1]+arr[i]);
            //일때까지의 합 후보들
            if(sub_tot[i] > max_tot)
            {
                max_tot = sub_tot[i];
            }
        }
        System.out.println(max_tot);
    }
}