package baek_2525;

import java.util.Scanner;

public class Oven_timer 
{
	public static void main(String[] args) {
		int T, M, RT,RM;
		int Pm;
		int totm;
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		M = sc.nextInt();
		Pm = sc.nextInt();
		
		totm=T*60+M+Pm;
		
		RT = (totm/60)%24;
		RM = totm%60;
		
		
		System.out.printf("%d %d",RT, RM);
	}
}
