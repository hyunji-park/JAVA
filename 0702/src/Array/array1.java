package Array;

import java.util.Scanner;

public class array1 {
	public static void main(String[] args) {
		int []arr; //arr�̶�� ������ ������ ����� 
		// ������ �� ������ ����. ������ �޸� ���� Ȯ���ؾ� ��.
		
		// new ������ : heap �������� �޸𸮸� Ȯ���� �� ������ 
		// ����ϸ� ������ ù ��° �� �ּ�, ������ �����ϸ� null �� ����.
		arr = new int[10];
		System.out.println(arr);
		
		//���ο� �޸𸮰� ����鼭 ���� �޸𸮴� gabage��.
		//JVM�� �ִ� �������÷��Ͱ� ƴ�� �� ������ ����
		arr = new int[10];
		System.out.println(arr);
		
		//�ε��� - ���ȣ�� ������ ���� ����[0���� ����]
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		System.out.println(arr[8]);
		System.out.println(arr[9]);
		//System.out.println(arr[10]);
		// [10] ���� ����
		
		//for���� ����Ͽ� 10,20,30,...
		//arr[i]=(i+1)*10
		int i;
		for(i=0; i<arr.length; i++) {
			arr[i] = (i+1)*10;
		}
		for(i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int []a= new int[] {1,2,3,4,5,6,7,8,9,10};
		for(i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		double []d= new double[5];
		d[0]=10.0;
		d[1]=20.0;
		d[2]=30.0;
		for(i=0; i<d.length; i++) {
			System.out.println(d[i]);
		}
		
		//���ڹ迭
		char []s = new char[] {'t','e','s','t'};
		for(i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		//���� 10�� �޾� �迭�� �־��
		int sum = 0, j;
		int arr1[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(j=0;j<arr1.length;j++) {
		System.out.printf("%d��° : ", j+1);
		arr1[j] = sc.nextInt();
		}
		//���
		for(j=0;j<arr1.length;j++) {
			sum += arr1[j];
		}
		//���
		System.out.print("�迭 ��� : ");
		for(j=0;j<arr1.length;j++) {
			System.out.printf("%4d",arr1[j]);
	}
		System.out.println();
		System.out.printf("�հ� : %4d\n",sum);
	}
}
