package Ex;

import java.util.Scanner;

public class randomVnum {
	public static void main(String[] args) {
		//���ڸ��߱� ����
		int computer, person;
		boolean flag; //false ������ true ����
		final int TOT_CNT = 4;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int game_count = 0, match_count = 0;
		String again;
		
		do {
			flag = false;
			count = 0;
			computer = (int)(Math.random()*10)+1; 
			// 1. ��ǻ�Ͱ� 1�� ����
			
			while(count < TOT_CNT && flag ==false) {
				System.out.print("1~10���� �߿� �ϳ��� �����ϼ���");
				person = sc.nextInt();
				
				if(computer > person) {
					System.out.println("���ڰ� �۴�");
				}
				else if(computer < person) {
					System.out.println("���ڰ� ũ��");
				}
				else {
					flag = true;
				}
				count++;
			}
			if(flag == true) {
				System.out.printf("%d���� ����\n", count);
				match_count++; //������ ���� ����
			}
			else {
				System.out.printf("%d���� ��ȸ�� �� ����ϼ̽��ϴ�.\n", TOT_CNT);
			}
			game_count++; //��ü ����
			System.out.print("���?(1.��/2.�ƴϿ�)");
			again = sc.next();
		}
		while(again.equals("1")); //again.equals("1") -> 1������ ��� ��
		System.out.printf("�� %d�� �߿� %d�� ���߼̽��ϴ�.\n",game_count, match_count);
	}
}
