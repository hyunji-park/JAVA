package ��������Ǯ��;

import java.util.Scanner;

public class Ǯ�� {
	public static void main(String[] args) {
		// 1. ������ �Է� �ڷ�
		// 2. ����ڷ� : ���
		// 3. �� ���� ������ : �����հ�, ī��Ʈ
		char gender;
		double year_pay;
		double avg;
		double m_sum = 0, f_sum = 0;
		int m_cnt = 0, f_cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		//�ʿ��� �������� �ʱ�ȭ(0���� ä��� ��)
		System.out.print("����");
		gender = sc.next().charAt(0);
		System.out.print("����");
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
			System.out.print("����");
			gender = sc.next().charAt(0); //charAt(0)ù���ڸ� ������ �ڿ� ���ᵵ ����
			System.out.print("����");
			year_pay = sc.nextDouble();
		}
		if(m_cnt!=0)
			System.out.printf("���� ��� ���� %.2f\n", m_sum/m_cnt);
		if(f_cnt!=0)
			System.out.printf("���� ��� ���� %.2f\n", f_sum/f_cnt);
	}
}
