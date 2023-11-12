package baek_24511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class QScape
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int qsN = Integer.parseInt(br.readLine());
		String request = br.readLine();
		String initial_val_num = br.readLine();
		int inputN = Integer.parseInt(br.readLine());
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		QS qs = new QS(qsN,request,initial_val_num);
		
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreElements())
		{
			sb.append(qs.pushpop(Integer.parseInt( st.nextToken() ) )+" " ) ;
		}
		
		System.out.println(sb);
	}
}

class QS
{
	int[] request;
	StringTokenizer st2;
	LinkedList<Deque<Integer>> mixed;
	int qsN;
	public QS(int qsN, String request, String initial_val_num)
	{
		StringTokenizer st = new StringTokenizer(request);//스택큐여부
		st2 = new StringTokenizer(initial_val_num);//각자료구조 초기값
		this.qsN = qsN;//자료구조 갯수
		
		
		this.request = new int[qsN];//스택 큐 종류 여부저장
		mixed = new LinkedList<Deque<Integer>>();//실제 값 저장
		
		//스택 큐 종류 넣는 부분
		for(int i=0;i<qsN;i++)
		{
			this.request[i] = Integer.parseInt(st.nextToken());
			mixed.addFirst(new LinkedList<>());
		}
		//값을 넣는 부분
		for(int i=0;i<qsN;i++)
		{
			mixed.get(i).add( Integer.parseInt( st2.nextToken() ) );
		}
	}
	
	public int pushpop(int input)
	{
		mixed.get(0).addFirst(input);
		
		//모든 자료구조를 거친뒤 값이 반환된다.
		for(int i=0;i<qsN;i++)
		{
			if(request[i]==0)//Queue인 경우
			{
				mixed.get(i).addFirst(input);
				input = mixed.get(i).pollLast();
				//System.out.println("input:"+input);
			}
			else//Stack인 경우 (1)
			{
				//System.out.println("checked");
			}
		}
		return input;		
	}
}


