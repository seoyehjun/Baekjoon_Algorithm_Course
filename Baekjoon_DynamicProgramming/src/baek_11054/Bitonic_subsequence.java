package baek_11054;

import java.util.Scanner;

public class Bitonic_subsequence
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] seq = new int[N];
        int[] sub_tot1 = new int[N];
        int[] sub_tot2 = new int[N];

        //왼쪽부터 작은게 온다고 할때 는 그냥 for문 쓰면 되지만
        //최대로 긴

        for(int i=0;i<N;i++)
        {
            seq[i] = sc.nextInt();
            sub_tot1[i] = 1;
            sub_tot2[i] = 1;
        }

        for(int i=0;i<seq.length;i++)
        {
            int temp =0;
            for(int j=0;j<i;j++)
            {
                if(seq[i]>seq[j] && sub_tot1[j]>temp)
                    temp = sub_tot1[j];
            }
            sub_tot1[i] = temp +1;
        }

        for(int i=seq.length-1 ; i>=0 ; i--)
        {
            int temp =0;
            for(int j=seq.length-1 ; j>i ; j--)
            {
                if(seq[i]>seq[j] && sub_tot2[j]>temp)
                    temp = sub_tot2[j];
            }
            sub_tot2[i] = temp +1;
        }

        int max = Integer.MIN_VALUE;
        int sub_tot1_max=0, sub_tot2_max=0;
        for(int i=0 ;i<N;i++)
        {
            if(sub_tot1[i]+sub_tot2[i]>max)
            {
                sub_tot1_max = sub_tot1[i];
                sub_tot2_max = sub_tot2[i];
                max = sub_tot1[i] + sub_tot2[i];
            }
        }

        System.out.println(max-1);
        //System.out.println("sub_tot1 : " + sub_tot1_max);
        //System.out.println("sub_tot2 : " + sub_tot2_max);

    }
}
