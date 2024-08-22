package Z_MiniProject;

import java.util.Random;
import java.util.Scanner;

public class engWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		String[] word = new String[5];		
		String[] answer = new String[5];
		String start = "시작";
		boolean[] value = new boolean[word.length];
		
//		for(int i = 0; i < value.length; i++) {
//			System.out.println(value[i]);
//		}						// value 의 기본값 확인 ** false로 확인됨
				
		
		int score = 0;
		System.out.println("============ 영단어 암기 프로그램 ============");
		
		for(int i = 0;i < word.length;i++) {
			System.out.println(i+1+"번 암기 할 **ENG** 단어 입력해주세요");
			String eng = in.next();
			word[i] = eng;
			System.out.println("암기 할 단어의 뜻을 입력해주세요");
			String han = in.next();
			answer[i] = han;
		}
		System.out.println("=============== 지금 부터 암기확인 들어갑니다 =================");
//		for(int i = 0; i < word.length; i++) {		// 입력한 값이 배열에 저장 됐는지 확인
//			System.out.println(word[i]);
//		}
		
		for(int i = 0; i < 5; i++) {
			int quizNum = i+1;
			int randomString = r.nextInt(word.length);
			
			for(;;) {
				if(value[randomString] == true) {
					randomString = r.nextInt(word.length);
					continue;
				}else {
					System.out.println("## "+quizNum+" ##     "+word[randomString]+"의 뜻을 한글로 적어주세요");
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
			System.out.println();
		}
		if(score == 100) {
			System.out.println("********************축하합니다 100점달성********************");
		}else {
			System.out.println("********************최종점수 "+score+"점******************");
		}
	}
}
