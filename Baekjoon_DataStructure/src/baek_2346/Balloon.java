package baek_2346;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Balloon 
{

    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Balloon1> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] moveset = new int[N];
        for(int i=0;i<N;i++)
        {
        	moveset[i] = Integer.parseInt(st.nextToken());
        }
        
        sb.append("1 ");
        int action = moveset[0];
       
        for(int i =1; i < N; i++)
        {
        	queue.add(new Balloon1( i + 1 , moveset[i]) );
        }
       
        while(!queue.isEmpty())
        {
        	if(action > 0)
        	{
        		for(int i=1;i<action;i++)
        		{
        			queue.add(queue.poll());
        		}
        		Balloon1 now = queue.poll();
        		action = now.numValue;
        		sb.append(now.index+" ");
        	}
        	else
        	{
        		for(int i=1;i<-action;i++)
        		{
        			queue.addFirst(queue.pollLast());
        		}
        		
        		Balloon1 now = queue.pollLast();
        		action = now.numValue;
        		sb.append(now.index+" ");
        	}
        }
        System.out.println(sb);
    }
}
//풍선의 인덱스와 숫자 값을 저장하는 클래스 Balloon
class Balloon1{
    int index;
    int numValue;

    public Balloon1(int index, int numValue) 
    {
        this.index = index;
        this.numValue = numValue;
    }
}
    