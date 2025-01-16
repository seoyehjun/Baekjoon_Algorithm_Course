package baek_1932;

import java.util.Scanner;

public class Integer_Pyramid
{
    static int maxvalue;
    static int[][] pyramid;
    static int[][] sub_tot;

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pyramid = new int[n][];
        sub_tot = new int[n][];

        for(int i=0 ; i<n ;i++)
        {
            pyramid[i] = new int[i+1];
            sub_tot[i] = new int[i+1];
        }

        for(int i=0 ; i<n ;i++)
        {
            for(int j=0 ; j<i+1 ; j++)
            {
                pyramid[i][j] = sc.nextInt();
            }
        }

        sub_tot[0][0] = pyramid[0][0];
        int maxvalue = pyramid[0][0];
        for(int i=1 ;i<n;i++)
        {
            for(int j=0; j<i+1 ;j++)
            {
                if(j==0)
                {
                    sub_tot[i][j] = sub_tot[i - 1][j] + pyramid[i][j];
                    if(sub_tot[i][j]> maxvalue) maxvalue = sub_tot[i][j];
                }
                else if(j!=0 && j!=i)//always true 코드는 무시해라 가독성때문에 조건 명시해놓은거니까
                {
                    sub_tot[i][j]
                            = Math.max(sub_tot[i-1][j-1] + pyramid[i][j], sub_tot[i-1][j] + pyramid[i][j]);
                    if(sub_tot[i][j]> maxvalue) maxvalue = sub_tot[i][j];
                }
                else if(j==i)
                {
                    sub_tot[i][j] = sub_tot[i - 1][j - 1] + pyramid[i][j];
                    if(sub_tot[i][j]> maxvalue) maxvalue = sub_tot[i][j];
                }

            }

        }
        System.out.println(maxvalue);

    }

}
