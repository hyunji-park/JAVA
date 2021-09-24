package Ex;

import java.util.Scanner;

public class randomvalue {
	public static void main(String[] args) {
		// Math.random : 랜덤값 가져옴(0~1사이)
		for(int i = 1; i <= 10; i++)
		// ex) 0.845 * 10 = 8
		System.out.println((int)(Math.random()*10));
		
		//1-3값에 머우르길 원함.
		//1. 가위 2. 바위 3. 보
		int num = 0, com = 0;
		//for(int i = 1; i <= 10; i++)
		//System.out.println((int)(Math.random()*3)+1);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1,2,3 중 하나를 입력하세요 : ");
		num = sc.nextInt();
		com = (int)(Math.random()*3)+1;
		
		if(num==1) {
			System.out.println("player : 가위");
		}
		if(num==2) {
			System.out.println("player : 바위");
		}
		if(num==3) {
			System.out.println("player : 보");
		}
		if(com==1) {
			System.out.println("com : 가위");
		}
		if(com==2) {
			System.out.println("com : 바위");
		}
		if(com==3) {
			System.out.println("com : 보");
		}
		if(com==num) {
			System.out.println("비겼습니다.");
		}
		if((com==1 && num==2) || 
				(com==2 && num==3) || (com==3 && num==1)) {
			System.out.println(" player가 이겼습니다.");
		}
		if((com==1 && num==3) || 
				(com==2 && num==1) || (com==3 && num==2)) {
			System.out.println("player가 졌습니다.");
		}
		

	}
}
