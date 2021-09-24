package Array;

import java.util.Scanner;

public class array1 {
	public static void main(String[] args) {
		int []arr; //arr이라는 참조형 변수만 만들고 
		// 데이터 들어갈 공간이 없음. 별도의 메모리 공간 확보해야 함.
		
		// new 연산자 : heap 공간에서 메모리를 확보한 후 공간이 
		// 충분하면 공간의 첫 번째 방 주소, 공간이 부족하면 null 값 전달.
		arr = new int[10];
		System.out.println(arr);
		
		//새로운 메모리가 생기면서 이전 메모리는 gabage됨.
		//JVM에 있는 가비지컬렉터가 틈날 때 쓰레기 수집
		arr = new int[10];
		System.out.println(arr);
		
		//인덱싱 - 방번호로 데이터 접근 가능[0부터 시작]
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
		// [10] 실행 에러
		
		//for문을 사용하여 10,20,30,...
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
		
		//문자배열
		char []s = new char[] {'t','e','s','t'};
		for(i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		//정수 10개 받아 배열에 넣어라
		int sum = 0, j;
		int arr1[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(j=0;j<arr1.length;j++) {
		System.out.printf("%d번째 : ", j+1);
		arr1[j] = sc.nextInt();
		}
		//계산
		for(j=0;j<arr1.length;j++) {
			sum += arr1[j];
		}
		//출력
		System.out.print("배열 요소 : ");
		for(j=0;j<arr1.length;j++) {
			System.out.printf("%4d",arr1[j]);
	}
		System.out.println();
		System.out.printf("합계 : %4d\n",sum);
	}
}
