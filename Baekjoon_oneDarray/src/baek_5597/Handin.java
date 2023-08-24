package baek_5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Handin 
{
	//list1 은 학생목록이고 list2는 과제를 제출한 학생의 목록입니다.
	public static void ishere(int[] list1, int[] list2)
	{
		boolean result;
		for(int i=0;i<list1.length;i++)
		{
			result = false;
			for(int j=0 ; j<list2.length;j++)
			{
				if(list1[i] == list2[j]) result = true;
			}
			//테스트 코드
			//System.out.printf("list1[%d]: %d \n",i,list1[i]);
			//System.out.println("result : "+result);
			//해당값이 없다면 출력
			if(!result) System.out.println(list1[i]);
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		int[] list = new int[30];
	
		for(int i=0;i<list.length;i++)
		{
			list[i] =i+1;
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] submitted = new int[30]; 
		String temp = "";
		int count =0;
		
		while((temp = br.readLine()) != null)
		{
			submitted[count++] = Integer.parseInt(temp);
		}
		
		/*for(int i=0;i<list.length;i++)
		{
			System.out.printf("list[%d]: %d ",i,list[i]);
			System.out.println();
		}
		for(int i=0;i<submitted.length;i++)
		{
			System.out.printf("submitted[%d]: %d ",i,submitted[i]);
			System.out.println();
		}*/
		//테스트 코드
		ishere(list,submitted);
	}
	
	
	
}
