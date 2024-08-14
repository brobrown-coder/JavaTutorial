package Test_Object;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// Q01 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int sum = num1 + num2;
		System.out.println("입력받은 값을 합 한 결과 = "+sum);
		
	}

}
