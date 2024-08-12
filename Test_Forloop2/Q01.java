package Test_Forloop2;

public class Q01 {

	public static void main(String[] args) {
		// 큰놈 int[] letter = {8,12,4,13,2,14,4,5}; 배열의 가장 큰수가 있는 인덱스를 출력하시오
		
		int[] letter = {8,12,4,13,2,14,4,5};
		int maxNum = 0;
		int maxNumIndex = 0;
		for(int i = 0; i < letter.length; i++) {
			if(letter[i] > maxNum) {
				maxNum = letter[i];
				maxNumIndex = i;
			}
		}
		System.out.println(maxNumIndex);

	}

}
