package Z_MiniProject;

import java.util.Random;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while (true) {

			System.out.print("ID를 입력하세요 : ");
			String userName = scanner.next();
			System.out.println(userName + "님 환영합니다");

			System.out.println("☆☆☆☆☆☆ 타자 게임을 시작합니다! ☆☆☆☆☆☆");

			String[] words = { "Star Fruit", "Finger Lime", "Kiwano", "Miracle Berry", "Amla", "Buggha's Fruts",
					"Marang" };
			String[] answers = { "스타프루트", "핑거라임", "키와노", "미라클베리", "암라", "부처의손", "마랑" };

			int score = 0;
			boolean[] asked = new boolean[words.length];

			for (int i = 0; i < 5; i++) {
				
				int questionIndex;
				
				do {
					questionIndex = random.nextInt(words.length);
				} while (asked[questionIndex]);

				asked[questionIndex] = true;

				int batter = i + 1;
				System.out.println("문제 " + batter + ": " + words[questionIndex]);
				String inputAnswer = scanner.next();

				if (answers[questionIndex].equals(inputAnswer)) {
					score += 20;
					System.out.println("정답");
				} else {
					System.out.println("오답");
				}
				System.out.println("현재 점수는 " + score + "점 입니다.");
			}

			if (score == 100) {
				System.out.println("축하합니다! 100점 달성입니다.");
			} else {
				System.out.println("최종 점수 " + score + "점");
			}

			System.out.print("게임을 다시 하시겠습니까? (y/n): ");
			String response = scanner.next();
			if (!response.equalsIgnoreCase("y")) {
				break;
			}
		}

		scanner.close();
	}

}
