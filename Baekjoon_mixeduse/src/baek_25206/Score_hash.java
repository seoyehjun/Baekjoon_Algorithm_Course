package baek_25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Score_hash 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Double> gradeList = new HashMap<String, Double>();
			{
				gradeList.put("A+", 4.5);
				gradeList.put("A0", 4.0);
				gradeList.put("B+", 3.5);
				gradeList.put("B0", 3.0);
				gradeList.put("C+", 2.5);
				gradeList.put("C0", 2.0);
				gradeList.put("D+", 1.5);
				gradeList.put("D0", 1.0);
				gradeList.put("F", 0.0);
			};
		
		double numer = 0;
		double parent = 0;
		
		StringTokenizer st;
		String[] score_row = new String[3];
		for(int i=0;i<20;i++)
		{
			st = new StringTokenizer(br.readLine());
			score_row[0] = st.nextToken();
			score_row[1] = st.nextToken();
			score_row[2] = st.nextToken();
			
			if(!score_row.equals("P"))
			{
				numer += Float.parseFloat(score_row[1]) * gradeList.get(score_row[2]);
				parent += Float.parseFloat(score_row[1]);
			}
		}
		System.out.printf("%.6f", numer/parent);
	}
}
