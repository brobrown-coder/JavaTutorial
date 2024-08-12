package Test_Forloop2;

public class Q00 {

	public static void main(String[] args) {
		//Q0 선택 받은 너
		//		int[] letter={8,12,4,13,2,14,4,5}; 짝수만 출력하시오.
		int[] letter={8,12,4,13,2,14,4,5};
		for(int i = 0; i < letter.length; i++) {
			if(letter[i]%2 == 0) {
				System.out.print(letter[i]+" ");
			}
		}
	}

}
