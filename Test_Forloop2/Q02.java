package Test_Forloop2;

public class Q02 {

	public static void main(String[] args) {
		// 현상수배	int[] letter = {8,12,4,13,25,14,4,5}; 범인을 찾으시오
		//			범인은 짝수이면서 가장 큰 값이다. 범인은 14입니다.
		
		int[] letter = {8,12,4,13,25,14,4,5};
		int maxValue = 0;
		int climinal = 0;
		for(int i = 0; i < letter.length; i++) {
			if(letter[i]%2 == 0) {
				if(letter[i] > maxValue) {
					maxValue = letter[i];
				}
			}
		}
		System.out.println(maxValue);

	}

}
