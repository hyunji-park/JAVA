package Ex;

public class ex22 {
	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "345";
		
		System.out.println('0'-'0'); //48 - 48
		System.out.println('1'-'1'); //49 - 49
		System.out.println('2'-'2'); //50 - 50
		
		//"123" -> 123
		int num, i;
		num = 0;
		for(i = 0; i < num1.length(); i++) {
			num = num * 10 + num1.charAt(i)-'0';
		}
		System.out.println(num);
		
	 //	int result = Integer.parseInt(num1);
	 //	System.out.println(num1);

	}
}
