package Test_Object;

import java.util.Scanner;					//		in.close(); 	==>		 import 종료

public class Q00 {

	public static void main(String[] args) {
		// Q00  키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		Scanner in = new Scanner(System.in);
		int oddAndEven = in.nextInt();
		
		if (oddAndEven%2 == 0) {
			System.out.println("짝수 입니다");
		}else {
			System.out.println("홀수 입니다");
		}

//		System.out.println(oddAndEven);
		
	}

}
