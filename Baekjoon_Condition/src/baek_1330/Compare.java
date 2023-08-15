package baek_1330;

import java.util.Scanner;

public class Compare {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		do
		{
			a= sc.nextInt();
			b= sc.nextInt();
			if(a>=-10000&&a<=10000&&b>=-10000&&b<=10000)break;
		}while(true);
		
		if(a>b)
		{
			System.out.print(">");
		}
		else if(a<b)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("==");
		}
	}

}
