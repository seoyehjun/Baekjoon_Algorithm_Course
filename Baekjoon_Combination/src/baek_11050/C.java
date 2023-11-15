package baek_11050;

import java.util.Scanner;

public class C 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), K = sc.nextInt();
		
		int son =1;
		for(int i=1;i<=N;i++)
		{
			son *=i;
		}
		int parent1 =1, parent2=1;
		for(int i=1;i<=(N-K);i++)
		{
			parent1 *= i;
		}
		for(int i=1;i<=K;i++)
		{
			parent2 *=i;
		}
		//System.out.println("son:"+son);
		//System.out.println("parent1:"+parent1);
		//System.out.println("parent2:"+parent2);
		
		System.out.println(son/parent1/parent2);
	}
}
