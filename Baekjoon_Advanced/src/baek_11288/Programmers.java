package baek_11288;
//https://chamggae.tistory.com/190 -->동적 계획법 풀이
import java.util.Arrays;

class Programmers
{
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] list = {2, 3, -6, 1, 3, -1, 2, 4};
		System.out.println(sol.solution(list));
	}
}
class Solution {
    public long solution(int[] sequence) 
    {
      
       long max=0;
       
       for(int i=1;i<=sequence.length;i++)//요소 갯수
       {
    	   
    	   for(int j=0;j<sequence.length;j++)//시작index
    	   {
    		   if(j+i>sequence.length)
    			   break;
    		   
    		  // int[] temp_list = Arrays.copyOfRange(sequence, j, j+i);//브루드포스트
    		   long temp_result = ex(sequence,j,j+i);
    		   if(temp_result>max) max=temp_result;//펄수 수열 곱&합 중 큰것 반환
    	   }
       }
       
       return max;
    }
    public long ex(int[] s1,int start,int end)//두가지의 펄수 순열 계산
    {
    	/*for(int i=0;i<s1.length;i++)
    	{
    		System.out.print(s1[i]+" ");
    	}
    	System.out.println();*/
    	 int start1 = 1,result1=0;
    	 int start2 = -1,result2=0;
    	 for(int i=start ; i<end ; i++)
    	 {
    		 result1 += s1[i]*(start1);
    		 result2 += s1[i]*(start2);
    		 start1 *=-1;
    		 start2 *=-1;
    	 }
        
    	 if(result1>result2)return result1;
    	 else return result2;
    }
}