package _04객체;

import java.util.Random;

public class _00_Random {	// 6개의 랜덤한 로또번호

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];	// 변수명, 길이, 인덱스
		Random r = new Random();		// ctrl shift o 	==>		 import단축키
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45+1);
		}
		
		for(int i = 0; i < lotto.length; i++) {
			if(i == lotto.length-1) {
				System.out.println("보너스 : "+lotto[i]);
			}else {
				System.out.println(lotto[i]);
			}
		}
		
	}

}
