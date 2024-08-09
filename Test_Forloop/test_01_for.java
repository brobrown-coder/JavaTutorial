package Test_Forloop;

public class test_01_for {

	public static void main(String[] args) {
		// Q1 100 부터 999까지의 숫자중 홀수만 출력하시오
		System.out.println("Q1 100 부터 999까지의 숫자중 홀수만 출력하시오");
		for(int i = 100 ; i < 1000; i++) {
			if(i%2 == 1) {
				System.out.print(i+",");
			}
		}
		System.out.println(" ");
		
		// Q2 1부터 100까지의 숫자중 홀수의 총합을 구하시오
		System.out.println("Q2 1부터 100까지의 숫자중 홀수의 총합을 구하시오");
		int sum1to100 = 0;
		for(int i = 0; i <100; i++) {
			if((i+1)%2 == 1) {
				sum1to100 += i;
			}
		}
		System.out.println(sum1to100);
		
		// Q3 다음과 같이 출력하시오 10 9 8 7 6 5 4 3 2 1
		System.out.println("Q3 다음과 같이 출력하시오 10 9 8 7 6 5 4 3 2 1");
		for(int i = 10 ; i > 0; i--) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
		// Q4 배열에서 배열의 값이 짝수인 것만 출력하시오
		System.out.println("Q4 배열에서 배열의 값이 짝수인 것만 출력하시오");
		int[] arr = {45,23,25,64,3,24,48};
		for(int i = 0; i<7 ; i++) {
			if(arr[i]%2 == 0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println(" ");
		
		// Q6 배열에서 배열의 값이 홀수인 곳의 인덱스만 출력하시오
		System.out.println("Q6 배열에서 배열의 값이 홀수 인 곳의 인덱스만 출력하시오");
		for(int i = 0; i<7 ; i++) {
			if(arr[i]%2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(" ");
		
		// Q7 배열의 값을 모두 더한 총합을 구하시오
		System.out.println("Q7 배열의 값을 모두 더한 총합을 구하시오");
		int sumArray = 0;
		for(int i =0; i < 7; i++) {
			sumArray += arr[i];
		}
		System.out.println(sumArray);
		
		
		// Q8 짝수는 모두 몇개인가요?
		System.out.println("Q8 짝수는 모두 몇개인가요?");
		int countArray = 0;
		
		for(int i = 0; i < 7; i++) {
			if(arr[i]%2 == 0) {
				countArray++;
			}
		}
		System.out.println(countArray);
		
		
		
		
		
		
		
	}

}
