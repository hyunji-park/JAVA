package Ex;

import java.util.Scanner;

public class randomvalue {
	public static void main(String[] args) {
		// Math.random : ������ ������(0~1����)
		for(int i = 1; i <= 10; i++)
		// ex) 0.845 * 10 = 8
		System.out.println((int)(Math.random()*10));
		
		//1-3���� �ӿ츣�� ����.
		//1. ���� 2. ���� 3. ��
		int num = 0, com = 0;
		//for(int i = 1; i <= 10; i++)
		//System.out.println((int)(Math.random()*3)+1);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1,2,3 �� �ϳ��� �Է��ϼ��� : ");
		num = sc.nextInt();
		com = (int)(Math.random()*3)+1;
		
		if(num==1) {
			System.out.println("player : ����");
		}
		if(num==2) {
			System.out.println("player : ����");
		}
		if(num==3) {
			System.out.println("player : ��");
		}
		if(com==1) {
			System.out.println("com : ����");
		}
		if(com==2) {
			System.out.println("com : ����");
		}
		if(com==3) {
			System.out.println("com : ��");
		}
		if(com==num) {
			System.out.println("�����ϴ�.");
		}
		if((com==1 && num==2) || 
				(com==2 && num==3) || (com==3 && num==1)) {
			System.out.println(" player�� �̰���ϴ�.");
		}
		if((com==1 && num==3) || 
				(com==2 && num==1) || (com==3 && num==2)) {
			System.out.println("player�� �����ϴ�.");
		}
		

	}
}
