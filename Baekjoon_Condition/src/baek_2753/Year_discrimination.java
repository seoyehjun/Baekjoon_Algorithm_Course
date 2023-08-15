package baek_2753;

import java.util.Scanner;

public class Year_discrimination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int isright;
		
		if((input%4==0&&!(input%100==0))||(input%400==0))isright=1;
		else isright =0;
		
		System.out.print(isright);
		
	}
}
