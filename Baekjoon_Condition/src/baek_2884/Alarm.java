   package baek_2884;

import java.util.Scanner;

public class Alarm {
	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), M=sc.nextInt();
		int tot = H*60 + M;
		int rs_tot = tot-45;//tot와 rs_tot는 시간을 모두 분으로 환산한것
		
		if( rs_tot < 0 )//0시 00분 아래로 갈경우
		{
			rs_tot = 24*60+rs_tot;//rs_tot는 음수 값이다
		}
		
		int rs_H = rs_tot/60;
		int rs_M = rs_tot%60;
	
		System.out.printf("%d %d",rs_H,rs_M);
	}
	
}
