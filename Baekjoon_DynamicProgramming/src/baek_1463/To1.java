package baek_1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class To1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] map = new int[N+1];

        map[1] = 0;
        if(N>=2)
            map[2] = 1;
        if(N>=3)
            map[3] = 1;
        if(N>=4)
            map[4] = 2;

        int temp1=0, temp2=0, temp3=0;
        for(int i=5; i<=N;i++)
        {
            temp1=Integer.MAX_VALUE;temp2=Integer.MAX_VALUE;temp3=Integer.MAX_VALUE;

            // 빼기1
            temp1 = map[i-1];

            // 나누기2
            if(i%2 == 0)
                temp2 = map[i/2];

            // 나누기3
            if(i%3 == 0)
                temp3 = map[i/3];

            map[i] = Math.min(temp1, Math.min(temp2,temp3)) + 1;
            //+1은 위 3개 연산중 하나를 뜻함 그중 필요연산수가 잴 적은것을 선택
            System.out.printf("map[%d] = %d \n",i,map[i]);
        }
        System.out.println(map[N]);
    }
}
