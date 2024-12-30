package baek_14889;

import java.util.Scanner;

public class Start_Link
{
    static int N;
    static int[][] S;
    static boolean[] team;
    static int minDifference = Integer.MAX_VALUE;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();//총 선수수 N/2씩 배치한다
        S = new int[N][N];//점수판
        team = new boolean[N]; // team 배열중 두개를 true로 바꾸면 나머지 팀은 false로 표현

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                S[i][j] = sc.nextInt();
            }
        }

        backtrack(0, 0);
        System.out.println(minDifference);
    }

    public static void backtrack(int idx, int count)
    {
        if(count >= N/2)
        {
            calculateDifference();
            return;
        }

        for(int i=idx; i<N; i++)
        {
            team[i] = true;
            backtrack(idx+1, count+1);
            team[i] = false;
        }
    }

    public static void calculateDifference()
    {
        int team1 = 0;
        int team2 = 0;

        for(int i=0;i<N;i++)
        {
            for(int j=i;j<N;j++)
            {
                 if(team[i] && team[j])//i 와 j가 한팀이면
                 {
                     team1 = S[i][j]+S[j][i];
                 }
                 else if(!team[i] && team[j])//i와 j가 away팀이라면
                 {
                     team2 = S[i][j]+S[j][i];
                 }
                 if(Math.abs(team1-team2)<minDifference)minDifference = Math.abs(team1-team2);
            }
        }
    }
}
