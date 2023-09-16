package baek_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count_word 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp = br.readLine();
		
		int[] alpa_B = new int[26];
		int[] alpa_S = new int[26];
		int[] alpa_BS = new int[26];
		
		for(int i=0 ; i<temp.length() ; i++)
		{
			int idx = temp.charAt(i);
			
			if(idx>='A' && idx<='Z')
			{
				alpa_B[idx-65]++;
			}
			else if(idx>='a' && idx<='z') 
			{
				alpa_S[idx-97]++;
			}
		}
		
		int many=0;
		int many_idx=0;
		for(int i=0;i<26;i++)
		{
			alpa_BS[i] = alpa_B[i] + alpa_S[i];
		}
		for(int i=0;i<26;i++)
		{
			if(alpa_BS[i]>many)
			{
				many = alpa_BS[i];
				many_idx = i;
			}
		}
		
		int count=0;
		for(int i=0;i<26;i++)
		{
			if(many == alpa_BS[i])
			{
				count++;
			}
		}
		
		if(count==1)
		{
			System.out.print((char)(many_idx+65));
		}
		else if(count > 1)
		{
			System.out.print("?");
		}
		
	}
}
