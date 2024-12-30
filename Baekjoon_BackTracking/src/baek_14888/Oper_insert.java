package baek_14888;
import java.util.Scanner;

public class Oper_insert
{
    //아이디어 1. 전역변수로 빼놓은 연산자들과, 피연산자, 그리고 MAX MIN값들
    static int N;
    static int[] numbers;
    static int[] operators = new int[4]; // 덧셈, 뺄셈, 곱셈, 나눗셈의 개수
    static int maxValue = Integer.MIN_VALUE;
    static int minValue = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 수의 개수 입력
        numbers = new int[N];
        for (int i = 0; i < N; i++)
        {
            numbers[i] = sc.nextInt(); // 수열 입력
        }
        for (int i = 0; i < 4; i++)
        {
            operators[i] = sc.nextInt(); // 연산자의 개수 입력
        }
        sc.close();
        backtrack(numbers[0], 1); // 백트래킹 시작
        System.out.println(maxValue); // 최댓값 출력
        System.out.println(minValue); // 최솟값 출력
    }

    // 백트래킹 메서드
    public static void backtrack(int currentValue, int index)
    {
        if(index>=N)
        {
            if(minValue > currentValue) minValue = currentValue;
            if(maxValue < currentValue) maxValue = currentValue;
            return;
        }

        for(int i=0;i<4;i++)
        {
            if(operators[i]>0)
            {
            /*
                ※   1, 2, 3, 4, 5 (문제 상황중 연산자 5개가 하나씩 있는 상황을 가정해서 풀이 해보자)   ※


                                            for 반복문을 따라서 operator[i]에 값이 존재할경우 모든 연산자 에대해 순열을 만들어준다.
                                            (해당 예시에서는 1, 5는 이미 썻으니 2,3,4 사용)
                                            ↓
                1-2-3   1-3-2   1-4-2   1-5-2
                    4       4       3       3
                    5       5       5       4
                    ↑       ↑
                    |   이 위쪽3번째 자리에 2가 쓰일려면 operator[i]++가 필요하다 (1-2-*순열이 끝난뒤 1-3-*순열로 넘어갈때 2복구됨)
                    |
                    2의 가지이후에는 더이상 2가 쓰이면 안돼기 때문에 operators[i]--(2가 두개있을경우에는 한번더 쓸 수 있겠지)

             */
                operators[i]--;// 재귀 가지 시작전에 해당 연산자 사용처리
                switch (i)
                {
                    case 0:
                        backtrack(currentValue + numbers[index], index + 1);
                        break;
                    case 1:
                        backtrack(currentValue - numbers[index], index + 1);
                        break;
                    case 2:
                        backtrack(currentValue * numbers[index], index + 1);
                        break;
                    case 3:
                        backtrack(currentValue / numbers[index], index + 1);
                        break;
                }
                operators[i]++;// 다음 재귀 가지 시작하기 전에 연산자 복구;
            }

        }
    }
}
