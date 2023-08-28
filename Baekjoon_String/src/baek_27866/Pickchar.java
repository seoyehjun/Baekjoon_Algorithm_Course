package baek_27866;

import java.util.Scanner;

public class Pickchar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		int idx = sc.nextInt();
		
		System.out.print(st.charAt(idx-1));
	}

}
