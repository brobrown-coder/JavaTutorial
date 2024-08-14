package Test_Object;

import java.util.Random;

public class Q02 {

	public static void main(String[] args) {
		// Q02 행운의 숫자 인지를 판별해 보자
		// 1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
		// 이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자 입니다.
		Random r = new Random();
		int ran1to100 = r.nextInt(99)+1;
		if(ran1to100%7 == 0) {
			System.out.println(ran1to100+"은 행운의 숫자입니다.");
		}else {
			System.out.println(ran1to100+"은 조심해야하는 숫자입니다.");
		}
//		System.out.println(ran1to100);
	}

}
