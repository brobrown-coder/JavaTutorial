package TestPM;

public class test04 {

	public static void main(String[] args) {
		// Q1===============================================================================
		System.out.println("Q1 ================ 1-100 숫자중 홀수는 더하고 짝수는 뺀값 1개 출력");
		int addOddOutEven = 0;
		for(int i = 0; i < 100; i++) {
			if((i+1)%2 == 1) {
				addOddOutEven += i;
			}else {
				addOddOutEven -= i;
			}
		}
		System.out.println(addOddOutEven);
		
		// Q2===============================================================================
		System.out.println("Q2 ================ 1-100 숫자중 홀수끼리 더한값 짝수끼리 더한값 각각 출력");
		int addOdd = 0;
		int addEven = 0;
		for(int i = 0; i <100; i++) {
			if((i+1)%2 == 1) {
				addOdd += i;
			}else {
				addEven += i;
			}
		}
		System.out.println("홀수끼리 더한값:"+addOdd+"  짝수끼리 더한값:"+addEven);
		
		// Q3===============================================================================
		System.out.println("Q3 ================ 1부터 100까지 숫자중 홀수의 개수");
		int oddCount = 0;
		for(int i = 0; i <100; i++) {
			if((i+1)%2 == 1) {
				oddCount++;
			}
		}
		System.out.println(oddCount);
		
		// Q4===============================================================================
		System.out.println("Q4 100 - 999 까지 각자리수별 숫자합의 총 합계 ex) 453 -> 4+5+3");
		int divNum = 0;
		for(int i = 100; i < 1000; i++) {
			divNum += i/100 + i%100/10 + i%10;
		}
		System.out.println(divNum);
		
		// Q5===============================================================================
		System.out.println("Q5 100 - 999 숫자중 범인은 십의자리에 있고, 3의 배수이다 범인 숫자 모두 출력");
		for(int i = 100; i < 1000; i++) {
			if(((i%100)/10)%3 == 0) {
				System.out.println(i);
			}
		}
		
		// Q6====================================================미해결====================
		System.out.println("Q6 0-100 숫자 중 0부터 1 2 3 순서대로 합한값을 누적하려 44를 넘어가게 하면 범인");
		int orderSum = 0;
		int[] minNum = new int[100];		
		int n = 0;
		for(int i = 0; i <100; i++) {
			orderSum += i+1;
			if(orderSum > 44) {			// 합계 44 이상부터 배열에 저장 하여 인덱스0 번 출력
				minNum[n] = i+1;
				n++;						
			}
		}
		System.out.println(minNum[0]);
		
		// Q7===============================================================================
		System.out.println("Q7 print 에서 ln 빼고 실행시 줄바꿈 없음 1~10까지 결과값 출력");
		for(int i = 0; i < 10; i++) {
			System.out.print(i+1);
			if(i<9) {
				System.out.print("+");
			}
		}
		System.out.println("");
		
		// Q8===============================================================================
		System.out.println("Q8 i는 피보나치수열의 개수, 총8개의 피보나치 수를 구하고 합한값을 출력");
		int a = 0;
		int b = 0;
		int fib = 1;
		int sumFib = 0;
		for(int i = 0; i < 8; i++) {
			System.out.print(fib);
			if(i<7) {
				System.out.print("+");
			}
			sumFib += fib;
			a = b;
			b = fib;
			fib = a+b;
		}
		
		System.out.println("="+sumFib);
		
		
		// Q9 ===============================================================================
		System.out.println("Q9 i를 피보나치 수로 정의 한다 i의 변화는 1 1 2 3 5 8 13 이 된다");
		int c = 0;
		int d = 0;
		int fibI = 1;
		for(int m = 0; m < 7; m++) {
			System.out.println(fibI);
			c = d;
			d = fibI;
			fibI = c+d;
			for(int i = 1; i < 20; i += fibI) {
				
			}
		}

		
		// Q10 ===============================================================================
		System.out.println("Q10 987654321의 숫자를 변수2개와 for문 한개로 모든자리수를 던한합을 구하시오");
		int number = 5422;
		int sumAll = 0;
		for(int i = 10; i <= 1000000000; i*=10) {
			sumAll += (number%i)/(i/10);
		}
		System.out.println(sumAll);
	}

}
