package baek_1904;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Tile01
{
    static int N;
    static int result;
    static int[] arr;
    static int index;
    public static void main(String args[])
    {
        result =0;
        index=0;
        Scanner sc = new Scanner(System.in);


        N = sc.nextInt();

        Deque<Integer> que = new ArrayDeque<>();

        for(int i=1 ; i<=N ;i++)
        {
            if(i == 1)
                que.add(1);
            else if(i==2)
                que.add(2);
            else//i=3 부터 실행
            {//i는 1부터 순차적으로 +1된다
                que.add((que.remove()+que.peek())%15746);
            }
        }

        System.out.println(que.pollLast());
    }

    /*
    public static void dynamic(int count)
    {
        System.out.println("count : "+count);
        if(count == N )
        {
            result++;
            for(int i=0;i<arr.length;i++)
            {
                System.out.println("arr["+i+"] : "+arr[i]);
            }
            return;
        }
        else if(count>N)
        {
            return;
        }

        for(int i=0 ; i<2 ; i++)//00 아니면 1 이두개로 순열을 만들어야 한다.
        {
            if(i==0)
            {
                count++;
                arr[index++] = i;
                dynamic(count);
                index--;
            }
            else
            {
                count = count+2;
                arr[index++] =i;
                dynamic(count);
                index--;
            }
        }
    }

     */
}
