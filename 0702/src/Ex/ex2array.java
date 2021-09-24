package Ex;

import java.util.Scanner;

public class ex2array {
	public static void main(String[] args) {
		//실패,,
		int j;
		int money = 0;
		int sum_money = 124500;
		int sum_use = 583;
		int []arr1 = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(j=0;j<arr1.length;j++) {
		System.out.printf("%d호 : ", j+1);
		arr1[j] = sc.nextInt();
		}
		//계산
		for(j=0;j<arr1.length;j++) {
			money = (arr1[j])*(sum_money/sum_use);
			j++;
		}
		//출력
		for(j=0;j<arr1.length;j++) {
			System.out.printf("%4d",arr1[j]);
	}
		System.out.println();
		System.out.printf("세대 별 전기요금 : %4d %4d %4d %4d %4d\n"
				,money,money,money,money,money);
	}
}
