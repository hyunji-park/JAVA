package Ex;

import java.util.Scanner;

public class ex2array {
	public static void main(String[] args) {
		//����,,
		int j;
		int money = 0;
		int sum_money = 124500;
		int sum_use = 583;
		int []arr1 = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(j=0;j<arr1.length;j++) {
		System.out.printf("%dȣ : ", j+1);
		arr1[j] = sc.nextInt();
		}
		//���
		for(j=0;j<arr1.length;j++) {
			money = (arr1[j])*(sum_money/sum_use);
			j++;
		}
		//���
		for(j=0;j<arr1.length;j++) {
			System.out.printf("%4d",arr1[j]);
	}
		System.out.println();
		System.out.printf("���� �� ������ : %4d %4d %4d %4d %4d\n"
				,money,money,money,money,money);
	}
}
