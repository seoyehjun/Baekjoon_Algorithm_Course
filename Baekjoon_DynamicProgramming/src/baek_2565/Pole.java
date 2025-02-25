package baek_2565;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Pole
{
        static int N;
        public static void main(String args[])
        {
                Scanner sc = new Scanner(System.in);

                N = sc.nextInt();

                int[][] pole = new int[N][2];

                for(int i=0;i<N;i++)
                {
                        pole[i][0] = sc.nextInt();
                        pole[i][1] = sc.nextInt();
                }


                Arrays.sort(pole, Comparator.comparingInt(o -> o[0]) );

                int[] sub_tot = new int[N];

                sub_tot[0] = 1;
                for(int i=1;i<N;i++)
                {
                        for(int j=0;j<i;j++)
                        {
                                if(pole[i][1]>pole[j][1] && sub_tot[j]> sub_tot[i] )
                                {
                                        sub_tot[i] = sub_tot[j];
                                }
                        }
                        sub_tot[i]++;
                }

                int max = Integer.MIN_VALUE;
                for(int i=0;i<N;i++)
                {
                        if(sub_tot[i]>max)
                                max= sub_tot[i];
                }
                System.out.println(N-max);
        }

        /*
        //twist하나라도 있으면 바로 빠꾸로 가보자
        public static boolean is_twist(int[] a_pole, int[] b_pole)
        {
                int[] twist_count = new int[N];
                for(int i=0 ; i<N ; i++)
                {
                        for(int j=0 ; j<N ; j++)
                        {
                                if(j == i)continue;
                                if(a_pole[i] > a_pole[j] && b_pole[i] < b_pole[j]
                                || a_pole[i] < a_pole[j] && b_pole[i] < b_pole[j])
                                {
                                        twist_count[i]++;
                                }
                        }
                }
        }*/
}
