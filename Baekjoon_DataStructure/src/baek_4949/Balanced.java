package baek_4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Balanced 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String user_input = br.readLine();
		
		int first_idx=-1;
		for(int i=0;i<user_input.length();i++)
		{
			if(user_input.charAt(i)=='['||user_input.charAt(i)=='(')
			{
				first_idx=i;
				break;
			}
		}
		System.out.println("main first_idx:"+first_idx);
		if( first_idx==-1  || isvalid(user_input,first_idx) !=-1 )
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
	
	public static int isvalid(String str,int idx)
	{ 
		int length = 1;
		if(str.charAt(idx)=='[')
		{
			System.out.println("idx:"+idx);
			System.out.println("str.charAt:"+str.charAt(idx));
			
			for(int i=idx+1;i<str.length();i++)
			{
				length++;
				if(str.charAt(i)=='('||str.charAt(i)=='[')
				{
					if(isvalid(str,i)==-1)//재귀함수 밑에서 false 반환시
					{
						return -1; //해당 문자열 유효하지 않음
					}
					else
					{
						i +=isvalid(str,i)+1;
					}
				}
				
				if(str.charAt(i)==']')
				{
					return length;
				}
				else if(str.charAt(i)==')')
				{
					return -1;
				}
			}
		}
		else if(str.charAt(idx)=='(')
		{
			System.out.println("idx:"+idx);
			System.out.println("str.charAt:"+str.charAt(idx));
			
			for(int i=idx+1;i<str.length();i++)
			{
				length++;
				if(str.charAt(i)=='('||str.charAt(i)=='[')
				{
					if(isvalid(str,i)==-1)//재귀함수 밑에서 false 반환시
					{
						return -1; //해당 문자열 유효하지 않음
					}else
					{
						i +=isvalid(str,i)+1;
					}
				}
				
				if(str.charAt(i)==')')
				{
					return length;
				}
				else if(str.charAt(i)==']')
				{
					return -1;
				}
			}
		}
		return -1;
	}
}
