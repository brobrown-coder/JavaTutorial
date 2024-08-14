package Test_Object;

import java.util.Random;

public class Q03 {

	public static void main(String[] args) {
		// Q03 2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다
		//		7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다.
		Random r = new Random();
		int ranNum = 0;
		for(int i = 0; ; i++) {
			ranNum = r.nextInt(100)+1;
			System.out.println(ranNum);
			if(ranNum%7 ==0) {
				System.out.println(ranNum+"은 행운의 숫자입니다");
				break;
			}else {
				continue;
			}
		}
	}

}
