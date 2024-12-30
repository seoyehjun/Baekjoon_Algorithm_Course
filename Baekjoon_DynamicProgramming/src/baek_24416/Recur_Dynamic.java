package baek_24416;


import java.util.Scanner;

public class Recur_Dynamic
{
    // 초기 n 보다 작은 입력값은 없을것이다.
    // n-1, n-2 이런식으로 재귀호출 하니까.
    // 입력값을 인덱스로 표현, 할당값을 return값에 대응

    static int[] memozization;
    static int count_recur, count_dynamic;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        count_recur = 0;
        count_dynamic = 0;
        int n = sc.nextInt();
        memozization = new int[n+1];

        recur(n);
        dynamic(n);

        System.out.println(count_recur + " " + count_dynamic);
    }

    public static int recur(int n)
    {
        if(n==1 || n==2)
        {
            count_recur++;
            return 1;
        }
        else
        {

            return recur(n-1) + recur(n-2);
        }
    }

    public static int dynamic(int n)
    {
        int temp;
        if(n==1 || n==2)
        {
            return 1;
        }
        else if(memozization[n] !=0)
        {//사전에 계산된 값 사용
            return memozization[n];
        }
        else
        {//계산된 값이 없을때
            count_dynamic++;
            memozization[n] = dynamic(n-1) + dynamic(n-2);
            return dynamic(n-1) + dynamic(n-2);
        }
    }

}