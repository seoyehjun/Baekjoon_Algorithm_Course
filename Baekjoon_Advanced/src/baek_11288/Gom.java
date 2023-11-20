package baek_11288;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Gom 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<String>();
		int N = Integer.parseInt(br.readLine());
	
		int tot=0;
		for(int i=1;i<=N;i++)
		{
			String temp = br.readLine();
			set.add(temp);//중복제거를 위해 set에 넣는다
			if(temp.equals("ENTER"))
			{
				tot +=set.size()-1;
				set.clear();
			}
		}
		tot+=set.size();
		System.out.println(tot);
	}
	
}
