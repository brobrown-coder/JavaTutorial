package Test_2For;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	Q9 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
		//	String ttt ="aabbbcccaaaaddbbbaaaaa";
		String ttt ="aabbbcccaaaaddbbbaaaaa";
//		int cnt = 0;
//		int maxCnt = 0;
//		for(int i = 0; i < ttt.length(); i++) {
//			char temp = ttt.charAt(i);
//			cnt = 0;
//			if(temp == 'a') {
//				for(int j = i ; j < ttt.length(); j++) {
//					if(ttt.charAt(j) != 'a') {
//						break;
//					}else {
//						cnt++;
//					}
//				}
//			}
//			if(maxCnt < cnt) {
//				maxCnt = cnt;
//				i =i+cnt-1; // 중첩안되게
//			}
//		}
//		System.out.println(maxCnt);
		int cnt = 0;
		int maxCnt = 0;
		char nowChar = ' ';
		char maxChar = ' ';
		
		for(int i = 0; i < ttt.length(); i++) {
			nowChar = ttt.charAt(i);
			cnt = 0;
			for(int j = i; j < ttt.length(); j++) {
				if(ttt.charAt(j) != nowChar) {
					break;
				}else {
					cnt++;
				}
			}
			
			if(maxCnt < cnt) {
				maxChar = nowChar;
				maxCnt = cnt;
				i = i+cnt-1;
			}
		}
		System.out.println(maxCnt);
		System.out.println(maxChar);
	}

}
