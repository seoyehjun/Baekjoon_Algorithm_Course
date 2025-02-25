package baek_2156;

import java.util.Scanner;

public class Grape
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] glass = new int[n];
        int[] sub_tot = new int[n];

        for(int i=0;i<n;i++)
        {
            glass[i] = sc.nextInt();
        }

        sub_tot[0] = glass[0];
        if(n>=2)
            sub_tot[1] = glass[1] + glass[0];
        if(n>=3)
            sub_tot[2] = Math.max(glass[2] + glass[0],Math.max(glass[2] + glass[1],sub_tot[1]) );

        if(n>=4)
        {
            for (int i = 3; i < n; i++) {
                int temp1 = glass[i] + glass[i - 1] + sub_tot[i - 3];
                int temp2 = glass[i] + sub_tot[i - 2];
                int temp3 = sub_tot[i - 1]; //특정 sub_tot에는 해당 index의 glass를 선택하지 않는 경우 포함한다.
                sub_tot[i] = Math.max(temp1, Math.max(temp2, temp3));
            }
        }

        int maxvalue = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(sub_tot[i] > maxvalue)
                maxvalue = sub_tot[i];
        }

        System.out.println(maxvalue);

    }
}
