package _03for;

public class _00_for {

	public static void main(String[] args) {
		int[] a = {30,40,50,55,65};
		
		System.out.println("Q1 30 40 50 55 65 순으로 출력");
		for(int i = 0; i < 5 ; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Q1 65 55 50 40 30 순으로 출력");
		for(int i = 4; i > -1 ; i--) {
			System.out.println(a[i]);
		}
		
		System.out.println("Q2 40 50 55 65 30 순으로 출력");	
		for(int i = 0; i < 5 ; i++) {
			System.out.println(a[(i+1)%5]);
		}
		
		System.out.println("50 이상만 출력");				// 배열 순회를 반복하면서 값을 조건 판별 출력
		for(int i = 0; i < 5 ; i++) {
			if(a[i]>=50) {
				System.out.println(a[i]);
			}
		}
		
		System.out.println("50이상 숫자 카운트");
		int cnt = 0;
		for(int i = 0; i < 5 ; i++) {
			if(a[i] >= 50) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		System.out.println("50이상 점수 합계");
		int sum = 0;
		for(int i=0; i<5; i++) {
			if(a[i] >= 50) {
				sum += a[i];
			}
		}
		System.out.println(sum);
		
		System.out.println("50이상 평균");
		int cnt2 = 0;
		int sum2 = 0;
		for(int i=0; i<5; i++) {
			if(a[i] >= 50) {
				sum2 += a[i];
				cnt2++;
			}
		}
		System.out.println(sum2/cnt2);
		
		System.out.println("최저점수 제외한 평균");
		int minNum = 1000;
		int sum3 = 0;
		int cnt3 = 0;
	
		
		for(int i=0; i<5; i++) {
			if(a[i]<minNum) {
				minNum = a[i];
			}
			sum3 += a[i];
			cnt3++;
		}
		
		System.out.println((sum3-minNum)/(cnt3-1));
	}

}
