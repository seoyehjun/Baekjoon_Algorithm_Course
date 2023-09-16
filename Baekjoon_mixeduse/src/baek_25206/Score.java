package baek_25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Score 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String[] list = new String[30];
		float[] subject_value = new float[30];
		String[] student_grade = new String[30];
		
		int count =0;
		String str;
		while((str = br.readLine())!= null)
		{
			st = new StringTokenizer(str);
			
			list[count] = st.nextToken();
			subject_value[count] = Float.parseFloat(st.nextToken());
			student_grade[count] = st.nextToken();
			count++;
		}
		
		double numer=0; //
		double parent =0;
		for(int i=0;i<count;i++)
		{
			if(student_grade[i].equals("P"))continue;
			numer += subject_value[i] * change_grade_to_score(student_grade[i]);
			parent += subject_value[i];
		}
		
		System.out.printf("%.6f", numer/parent);
	}
	
	//과목평점(A+, A0, B+ ...)을 과목평점(4.5, 4.0, 3.5, ...)으로 변환시키는 func
	static double change_grade_to_score(String grade)
	{
		switch(grade)
		{
		case "A+":
			return 4.5;
		case "A0":
			return 4.0;
		case "B+":
			return 3.5;
		case "B0":
			return 3.0;
		case "C+":
			return 2.5;
		case "C0":
			return 2.0;
		case "D+":
			return 1.5;
		case "D0":
			return 1.0;
		case "F":
			return 0.0;
		}
		return 1.0;
	}
}
