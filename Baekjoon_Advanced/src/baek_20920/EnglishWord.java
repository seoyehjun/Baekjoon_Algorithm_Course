//https://propercoding.tistory.com/306 -> 참고함
//https://llshl.tistory.com/m/74 -> Comparator Comparable개념
package baek_20920;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class EnglishWord 
{
	public static void main(String[] args)throws IOException 
	{
		int N, M;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		List<String> list = new ArrayList<String>();
		HashMap<String,Integer> hash = new HashMap<String,Integer>();
		for(int i=0;i<N;i++)
		{
			String word = br.readLine();
			
			if(word.length() < M) continue;
			hash.put(word, hash.getOrDefault(word, 0)+1);
			
		}
		
		List<String> word_list = new ArrayList<>(hash.keySet());
		
		Collections.sort(word_list, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) 
			{
				if(Integer.compare(hash.get(s1), hash.get(s2))!=0)
				{
					return Integer.compare(hash.get(s2), hash.get(s1));
				}
				//단어빈도수 같으면 여기까지 온다
				if (s1.length() != s2.length()) 
				{
                    return s2.length() - s1.length();
                }
				//길이마저 같으면 알파벳비교로 간다(String 안에 Comparable 구현된듯)
                return s1.compareTo(s2);
			}
			
		});
		
		for (String str : word_list) {
            sb.append(str + "\n");
        }
        System.out.println(sb);
	}
}
