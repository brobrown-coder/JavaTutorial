package _03for;

public class dddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Continue 사용법
		// 1에서 10까지의 숫자중 짝수의 합 
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 1) {
				sum += i;
				continue;
			}
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 1) {
				sum2 += i;
				break;				//i가 홀수일때 반복문을 종료
			}
		}
		System.out.println(sum2);
		

	}

}
