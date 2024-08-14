package Test_Object;

import java.util.Random;

public class Q06 {

	public static void main(String[] args) {
		// Q06 
		//		컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
		//		가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
		//		오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다.
		Random r = new Random();
		int[] lottoArray = new int[10000];		//lottoArray = { 24,45,2,41,13.....}; 로또번호 1000만개 생성
		for(int i = 0; i < 10000; i++) {
			int lotto = r.nextInt(44)+1;
			lottoArray[i] = lotto;
		}
		
		int lottoRecommend = 0;	
		
		int[] countLotto = new int[45];			// countLotto = {1=12, 2=30, ....45=24};
		for(int i = 1; i < 46; i++) {			//  인덱스에 해당하는 로또번호 개수 배열 생성
			for(int j = 0; j < 10000; j++) {
				if(i == lottoArray[j]) {
					countLotto[i]++;
				}
			}
		}
		
		for(int i = 0; i<44; i++) {
			if(countLotto[i] > countLotto[i+1]) {
				lottoRecommend = i;
			}else if(countLotto[i] == countLotto[i+1]){
				lottoRecommend = i+1;
			}else if(countLotto[i] < countLotto[i+1]) {
				lottoRecommend = i+1;
			}
		}
			System.out.println(lottoRecommend);
		
	
		
	}

}
