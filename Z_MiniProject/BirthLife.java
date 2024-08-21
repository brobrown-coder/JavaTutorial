package Z_MiniProject;

import java.util.Scanner;

public class BirthLife {

	public static void main(String[] args) {
		
		
		
		for(;;){
			Scanner in = new Scanner(System.in);		
			System.out.println("생년월일을 6자리로 입력하세요.");
			String birth = in.next();
			char year = birth.charAt(0);
			System.out.println(birth);
			System.out.println(year);
			if(year == '7') {
				System.out.println("새로시작하는");
			}
			if(year == '8') {
				System.out.println("늙어버린");
			}
			if(year == '9') {
				System.out.println("한창인");
			}
			if(year == '0') {
				System.out.println("신생의");
			}
			break;
		}
	}

}
