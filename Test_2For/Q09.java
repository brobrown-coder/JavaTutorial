package Test_2For;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	Q9 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
		//	String ttt ="aabbbcccaaaaddbbbaaaaa";
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		int cnt = 0;
		for(int i = 0; i < ttt.length()-1 ; i++) {
			if(ttt.charAt(i) == ttt.charAt(i+1)) {
				cnt++;;
				System.out.println(ttt.charAt(i)+"  "+cnt);
			}else {
				cnt = 0;
				continue;
			}
		}
	}

}
