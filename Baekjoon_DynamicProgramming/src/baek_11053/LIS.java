package baek_11053;

import java.util.Scanner;

public class LIS
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

        sub_tot[0] = 1;

        for(int i=1 ; i<N ; i++)
        {
            for(int j=0 ; j<i ; j++)
            {
                if(arr[i] > arr[j] && sub_tot[j]>sub_tot[i])
                    sub_tot[i] = sub_tot[j];
            }
            sub_tot[i] ++;
        }

        int max= Integer.MIN_VALUE;
        for(int i =0 ;i<N;i++)
        {
            if(sub_tot[i]>max)
                max = sub_tot[i];
        }

        System.out.println(max);

    }
}
