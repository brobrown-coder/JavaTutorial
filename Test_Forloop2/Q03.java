package Test_Forloop2;

public class Q03 {

	public static void main(String[] args) {
		/*	비밀편지
		 *  String word = "gehoudfkimjnlvy";
		 *  int[] letter = {8,12,3,13,1,14,3,4};
		 *  letter 배열은 word 문자열 알파벳의 위치이다.
		 * 	letter 배열의 암호를 풀어서 편지의 내용을 출력하시오
		 */
		
		String word = "gehoudfkimjnlvy";
		String keyWord = "";
		int[] letter = {8,12,3,13,1,14,3,4};
		for(int i = 0; i < letter.length; i++) {
			keyWord += word.charAt(letter[i]);
		}
		System.out.println(keyWord);
		
	}

}
