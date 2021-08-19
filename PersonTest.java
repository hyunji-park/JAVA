package person;

import java.util.ArrayList;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person("박시원","01099026894");
		Person p2 = new Person("박현지","01090296170");
		Person p3 = new Person("이혜주","01026206238");
		
		//System.out.println(p1);
		
		ArrayList<Person> p = new ArrayList<>();
		
		//p.add(p1);
		//p.add(p2);
		p.add(0, p1);
		p.add(1, p2);
		p.add(2, p3);
	
		for(int i=0;i<p.size();i++) {
            System.out.println(p.get(i)); //person에서 private으로 변수를 만들어서 get으로 가져와야 함.
        }
	}
}
