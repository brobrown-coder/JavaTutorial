package Test_Forloop;

public class test_02_for {

	public static void main(String[] args) {
		/* String test = "abcdeabce";
		 * for(int i =0; i < 9; i++){
		 * 	  char aaa = test.charAt(i);
		 *    sysout(aaa);
		 * }
		 * 
		 * 위 코드를 분석하여 a 문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요
		 */
		System.out.println("**Q9** a 문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요");
		
		String test = "abcdeabce";
		int countString = 0;
		char aa = 'a';
		for(int i=0; i < 9; i++) {
			char aaa = test.charAt(i);
			if(aaa == aa) {
				countString++;
			}
		}
		System.out.println(countString);
		
		
		// Q10 int[] arr10 = {45,23,25,64,3,24,48} 배열에서 가장 큰 값과 인덱스를 출력하시오
		System.out.println("**Q10** int[] arr10 = {45,23,25,64,3,24,48} 배열에서 가장 큰 값과 인덱스를 출력하시오");
		int[] arr10 = {45,23,25,64,3,24,48};
		int maxValue = arr10[0];
		int maxValueIndex = 0;
		for(int i=0; i<arr10.length; i++) {
			if(maxValue < arr10[i]) {
				maxValue = arr10[i];
				maxValueIndex = i;
			}
		}
		System.out.println("최대값은" + maxValue);
		System.out.println("최대값의 인덱스번호는"+maxValueIndex);
		
		
		
		// Q11 범인은 100부터 999까지 숫자중에 여러명이다
		//     범인의 특징은 숫자의 각 자리수를 더한 값이 짝수이다 범인의 숫자를 모두 찾으시오
		System.out.println("**Q11** 100-999 숫자 중 범인의 특징은 숫자의 각 자리수를 더한 값이 짝수이다 범인의 숫자를 모두 찾으시오");
		int sumSplit = 0;
		for(int i = 100; i <1000; i++) {
			sumSplit = i/100 + i%100/10 + i%10/10;
			if(sumSplit%2 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		
		
		// Q12 int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		//    0은 터널이다 가장 긴 터널의 길이를 구하시오
		System.out.println("**Q12** 0은 터널이다 가장 긴 터널의 길이를 구하시오");
		int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		int countZero = 0;
		int maxValueTunnel = 0;
		for(int i = 1; i < arr.length; i++) {
			if((arr[i] == 0) && (arr[i] == arr[i-1])) {
				countZero++;
				if(maxValueTunnel < countZero+1) {
					maxValueTunnel = countZero+1;
				}
			}else{
				countZero = 0;
			}
		}
		System.out.println(maxValueTunnel);
		
		// Q13 int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,2,0,0,0,0,0,3,3};
		//    0은 터널이다 가장 긴 터널의 길이를 구하시오
		System.out.println("**Q13** 가장 긴 숫자와 길이를 출력하시오");
		int[] arr13 = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,2,0,0,0,0,0,3,3};
		int maxLenghtTunnel = 0;
		int countTunnelLength = 0;
		int tunnelIndex = 0;
		for(int i =1; i<24; i++) {
			if(arr13[i] == arr13[i-1]) {
				countTunnelLength++;
				if(maxLenghtTunnel < countTunnelLength) {
					maxLenghtTunnel = countTunnelLength+1;
					tunnelIndex = i;
				}
			}else {
				countTunnelLength = 0;
			}
		}
		System.out.println("가장 긴 숫자의 번호는 "+arr13[tunnelIndex]);
		System.out.println("가장 긴 숫자의 길이는 "+maxLenghtTunnel);				//** 이거 왜 7이 안나오지?
		
		// Q14 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
		// String ttt = "aabbbcccaaaaddbbbaaaaa";
		System.out.println("**Q14** 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요");
		String ttt = "aabbbcccaaaaddbbbaaaaa";	// 길이 22
		char alphabet = ' ';
		int alphabetLenght = 1;
		int maxAlphabetLength = 0;
		int alphabetIndex = 0;
		for(int i = 1; i < 22; i++) {
			if((ttt.charAt(i-1)) == (ttt.charAt(i))) {
				alphabet = ttt.charAt(i-1);
				alphabetLenght++;
				if(maxAlphabetLength < alphabetLenght) {
					maxAlphabetLength = alphabetLenght;
					alphabetIndex = i;
				}
			} else {
				alphabetLenght = 1;
			}
		}
		System.out.println("문자는 " + ttt.charAt(alphabetIndex));
		System.out.println("길이는 " + maxAlphabetLength);
		
		// Q15 압축하시오
		// String ttt = "aabbbcccaaaaddbbbaaaaa"; 압축 하는 방법 a2b3c3a4d2b3a5
		System.out.println("**Q15** 압축하시오");
		
	}
}