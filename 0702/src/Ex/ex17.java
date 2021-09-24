package Ex;

public class ex17 {
	//1의보수로 변환
	public static void main(String[] args) {
		String i_num = "110011";
		String o_num = "";
		
		for(int i = 0; i < i_num.length(); i++) {
			if(i_num.charAt(i)=='0')
				o_num+="1";
			else
				o_num+="0";
		}
		System.out.println(o_num);
	}
}
