package Z_MiniProject;

import java.util.Random;
import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		String[] word = {"곰이 목욕하는 탕은?","먹을 수록 떨리는 음식은?","먹고 살기위해 배워두면 좋은 술은?"};
		String[] answer = {"곰탕", "추어탕","기술" };
		int score = 0;
		System.out.println("============ 넌센스 퀴즈를 시작합니다 ============");
		
		for(int i = 0; i < word.length; i++) {
			score = 0;
			int quizNum = i+1;
			int randomString = r.nextInt(3);
			String inputAnswer = in.next();
			
			System.out.println("## "+quizNum+" ##     "+word[randomString]);
			if(inputAnswer == answer[randomString]) {
				System.out.println("정답");
			}
		}
	}
}
