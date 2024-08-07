package _02if;

public class _00_Q2 {

	public static void main(String[] args) {
		String name = "영수";
		int classNum = 21;
		int age = 20;
		int grade = 65;
		String result = "";
		
		if (age >= 18) {
			if (grade >= 90) {
				result = "A";
			}else if(grade >= 80) {
				result = "B";
			}else if(grade >= 70) {
				result = "C";
			}else if(grade >= 60) {
				result = "D";
				name = "*"+name;
			}else {
				result = "F";
			}
		}else {
			System.out.println("수강신청을 할 수 없는 연령 입니다.");
		}
		System.out.println(result);
		System.out.println(name);
		

	}

}
