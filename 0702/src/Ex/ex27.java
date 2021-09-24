package Ex;

import java.util.Scanner;

public class ex27 {
	public static void main(String[] args) {
		/*
		 * String name_number; 
		 * int sum = 0, i;
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("주민번호 입력 : "); 
		 * name_number = sc.next(); 
		 * for(i = 0; i < 12; i++) { 
		 * sum+= (name_number.charAt(i)-'0')*((i<=8)?(i+2):(i-6)); 
		 * }
		 * System.out.printf("%d",sum);
		 * 
		 * sum = sum%11; 
		 * System.out.printf("%d",sum);
		 * 
		 * sum = 11-sum; 
		 * System.out.printf("%d",sum);
		 * 
		 * if(sum == name_number.charAt(12)) { 
		 * System.out.println("올바른 주민번호입니다."); 
		 * }
		 * else { 
		 * System.out.println("잘못된 주민번호입니다."); 
		 * }
		 */
		
		
		//강사님 코드
		String jumin="6407131018433";
	      int last_check = jumin.charAt(12)-'0';
	      
	      int a1 = (jumin.charAt(0)-'0')*2;
	      a1 += (jumin.charAt(1)-'0')*3;
	      a1 +=  (jumin.charAt(2)-'0')*4;
	      a1 += (jumin.charAt(3)-'0')*5;
	      a1 += (jumin.charAt(4)-'0')*6;
	      a1 +=  (jumin.charAt(5)-'0')*7;
	      a1 +=  (jumin.charAt(6)-'0')*8;
	      a1 +=  (jumin.charAt(7)-'0')*9;
	      a1 +=  (jumin.charAt(8)-'0')*2;
	      a1 +=  (jumin.charAt(9)-'0')*3;
	      a1 +=  (jumin.charAt(10)-'0')*4;
	      a1 +=  (jumin.charAt(11)-'0')*5;
	      System.out.println(a1);
	      
	      int k=2;
	      a1=0;
	      for(int i=0; i<12; i++)
      {
	         a1 +=  (jumin.charAt(i)-'0')*k;
	         k++;
	         if(k>9)
	            k=2;
	      }
	      System.out.println(a1);
	      
	      a1 = a1%11;
	      System.out.println(a1);
	      
	      a1 = 11-a1;
	      System.out.println(a1);
	      if ( a1==last_check)
	      {
	         System.out.println("올바른 주민번호입니다.");
	      }
	      else
	      {
          System.out.println("잘못된 주민번호입니다.");
	      }

		
	}
}
