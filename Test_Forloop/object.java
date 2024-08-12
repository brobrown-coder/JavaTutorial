package Test_Forloop;

public class object {

	public static void main(String[] args) {
//		String test ="abcdeabce";		// 참조타입
//		int a = 10;			// 원시타입
//		
//		for(int i = 0; i < test.length(); i++) {
//			char aaa = test.charAt(i);
//			System.out.println(aaa);
//		}
		
		
		// Q14 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
		// String ttt = "aabbbcccaaaaddbbbaaaaa";
		System.out.println("**Q14** 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요");
		String ttt = "aabbbcccaaaaddbbbaaaaa";	// string 참조타입  (기능을 가지고 있다 ex charAt)
		for(int i = 0; i < ttt.length(); i++) {
			char a = ttt.charAt(i);
			System.out.println(a);
		}
		
	}

}
