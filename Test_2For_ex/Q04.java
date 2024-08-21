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
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(i+"번째 큰 값 찾는중__________");
			for(int j = 0; j < b.length-1; j++) {
				maxVal = 0;
				if(b[maxVal] < b[j]) {
					maxVal = j;
				}
			}
			
			int temp = b[b.length-1-i];
			b[b.length-1-i] = b[maxVal];
			b[maxVal] = temp;
			
			for(int k = 0; k<b.length; k++) {
				System.out.print(b[k]+" ");
			}
			System.out.println();
		}
		
//		 TODO Auto-generated method stub
//				int[] b = {93,45,83,58,75,56};
//				//다음조건에 따라 오름차순으로 정렬하시오.
//				int tempMaxIndex = 0;
//				
//				for(int i=0; i<b.length; i++) {
//					System.out.println(i+"번째 큰값 찾는 중 -------------");
//					tempMaxIndex = 0;
//					for(int j=0; j < b.length - i; j++) {
//						System.out.println(j +"번째 부터 서치");
//						if(b[tempMaxIndex] < b[j]) {
//							tempMaxIndex = j;
//						}
//					}
//					// 가장 큰 값과 뒤에 값과 swap
//					int temp = b[b.length-1-i];
//					b[b.length-1-i]=b[tempMaxIndex];
//					b[tempMaxIndex]=temp;
//					
//					// i번째 큰 값 찾아서 변경된 배열 확인 반복문
//					for(int k=0; k<b.length; k++) {
//						System.out.print(b[k]+" ");
//					}
//					System.out.println();
//					
//				}
	}

}
