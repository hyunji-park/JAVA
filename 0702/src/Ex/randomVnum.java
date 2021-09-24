package Ex;

import java.util.Scanner;

public class randomVnum {
	public static void main(String[] args) {
		//숫자맞추기 게임
		int computer, person;
		boolean flag; //false 못맞춤 true 맞춤
		final int TOT_CNT = 4;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int game_count = 0, match_count = 0;
		String again;
		
		do {
			flag = false;
			count = 0;
			computer = (int)(Math.random()*10)+1; 
			// 1. 컴퓨터가 1을 생각
			
			while(count < TOT_CNT && flag ==false) {
				System.out.print("1~10까지 중에 하나를 선택하세요");
				person = sc.nextInt();
				
				if(computer > person) {
					System.out.println("숫자가 작다");
				}
				else if(computer < person) {
					System.out.println("숫자가 크다");
				}
				else {
					flag = true;
				}
				count++;
			}
			if(flag == true) {
				System.out.printf("%d번에 맞춤\n", count);
				match_count++; //맞췄을 때만 증가
			}
			else {
				System.out.printf("%d번의 기회를 다 사용하셨습니다.\n", TOT_CNT);
			}
			game_count++; //전체 증가
			System.out.print("계속?(1.네/2.아니오)");
			again = sc.next();
		}
		while(again.equals("1")); //again.equals("1") -> 1누르면 계속 함
		System.out.printf("총 %d번 중에 %d번 맞추셨습니다.\n",game_count, match_count);
	}
}
