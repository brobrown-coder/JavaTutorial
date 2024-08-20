package Test_2For_ex;

public class Q02 {

	public static void main(String[] args) {
		//		int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		//		배열의 평균값을 구하시오. 소수점 표현하시오. 
		int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum/arr.length);
	}

}
