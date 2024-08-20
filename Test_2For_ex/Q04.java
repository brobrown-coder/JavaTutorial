package Test_2For_ex;

public class Q04 {

	public static void main(String[] args) {
		// Q04	int[] b = {93,45,83,58,75,56}
		//		다음조건에 따라 오름차순으로 정렬하시오.
		//		1. 가장큰 값을 찾아서 맨뒤 값과 교환한다.. 결과  {56,45,83,58,75,93}
		//		2. 두번째로 큰 값을 찾아서 맨뒤에서 두번째 자리의 값과 교환한다.  결과  {56,45,75,58,83,93}
		//		3. 세번째로 큰 값을 찾아서 맨뒤에서 세번째 자리의 값과 교환한다.  결과  {56,45,58,75,83,93}
		//		오름차순으로 정렬이 될때 까지 반복한다.
		
		int[] b = {93,45,83,58,75,56};
		int maxVal = 0;
		
		for(int i = 0; i<b.length; i++) {
			for(int k = 0; k<b.length; k++) {
				if(b[i] > b[k]) {
					for(int j = 0; j < b.length-k; j++) {
						if(maxVal < b[j]) {
							maxVal = b[j];
						}
					}
					for(int m = 0; m < b.length-k; m++) {
						if(maxVal == b[m]) {
							b[m] = b[b.length-1];
							b[b.length-1] = maxVal;
						}
					}
					maxVal = 0;
					
				}
			}
		}

		
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}			

		
	}

}
