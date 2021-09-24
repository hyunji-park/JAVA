package 과제;

import java.util.Scanner;

public class 과제 {
	public static void main(String[] args) {
	int gender, sal;
	int m_sum =0,m_cnt=0,f_sum=0,f_cnt=0;
	Scanner sc = new Scanner(System.in);
	
	do{
	System.out.print("성별을 입력하세요 : (m,f,z)");
	gender = sc.next().charAt(0);
	
	switch(gender) {
	case 'm':
	case 'M':
		System.out.println("연봉 : ");
		sal = sc.nextInt();
		m_sum += sal;
		m_cnt++;
		break;
	case 'f':
	case 'F':
		System.out.println("연봉 : ");
		sal = sc.nextInt();
		f_sum += sal;
		f_cnt++;
		break;
	case 'z':
	case 'Z':
		System.out.println("종료");
		break;
		}
	}
		while(gender!='z' && gender!='Z');
		if(m_cnt!=0) {
		System.out.printf("남자 평균 연봉 : %d", m_sum/m_cnt);
		}
		if(f_cnt!=0) {
			System.out.printf("여자 평균 연봉 : %d", f_sum/f_cnt);
		}
		
	}
}
