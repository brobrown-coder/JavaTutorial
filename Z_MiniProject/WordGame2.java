package Z_MiniProject;

import java.util.Random;
import java.util.Scanner;

public class WordGame2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		String[] word = {"apple","banana","mango","orange","watermelon","grape","kiwee" };
		String[] answer = {"사과", "바나나","망고","오렌지","수박","포도","키위"};
		
		boolean[] value = new boolean[word.length];
		
//		for(int i = 0; i < value.length; i++) {
//			System.out.println(value[i]);
//		}
				
		int score = 0;
		System.out.println("============ 영단어 맞추기 시작합니다 ============");
		
		for(int i = 0; i < 5; i++) {
			int quizNum = i+1;
			int randomString = r.nextInt(word.length-1);
			
			for(;;) {
				if(value[randomString] == true) {
					randomString = r.nextInt(word.length-1);
					continue;
				}else {
					System.out.println("## "+quizNum+" ##     "+word[randomString]);
					value[randomString] = true;
				}break;
			}
			
			
			String inputAnswer = in.next();
			
			if(answer[randomString].equals(inputAnswer)) {
				score += 20;
				System.out.println("정답");
			}else {
				System.out.println("오답");
			}
			System.out.println("현재점수는 "+score+"점 입니다");				
		}
		if(score == 100) {
			System.out.println("********************축하합니다 100점달성********************");
		}else {
			System.out.println("********************최종점수 "+score+"점******************");
		}
	}
}
