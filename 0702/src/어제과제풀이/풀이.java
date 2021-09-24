package 어제과제풀이;

import java.util.Scanner;

public class 풀이 {
	public static void main(String[] args) {
		// 1. 데이터 입력 자료
		// 2. 출력자료 : 평균
		// 3. 그 밖의 변수들 : 성별합계, 카운트
		char gender;
		double year_pay;
		double avg;
		double m_sum = 0, f_sum = 0;
		int m_cnt = 0, f_cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		//필요한 변수들의 초기화(0으로 채우는 거)
		System.out.print("성별");
		gender = sc.next().charAt(0);
		System.out.print("연봉");
		year_pay = sc.nextDouble();
		while(!(gender == 'Z' || gender == 'z')) {
			if(gender == 'M' || gender == 'm') {
				m_sum += year_pay;
				m_cnt++;
			}
			else {
				f_sum += year_pay;
				f_cnt++;
			}
			System.out.print("성별");
			gender = sc.next().charAt(0); //charAt(0)첫글자만 들어오고 뒤에 뭘써도 무시
			System.out.print("연봉");
			year_pay = sc.nextDouble();
		}
		if(m_cnt!=0)
			System.out.printf("남자 평균 연봉 %.2f\n", m_sum/m_cnt);
		if(f_cnt!=0)
			System.out.printf("여자 평균 연봉 %.2f\n", f_sum/f_cnt);
	}
}
