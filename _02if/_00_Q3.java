package _02if;

public class _00_Q3 {

	public static void main(String[] args) {
		// a와 b는 도로의 길이이며 위치이다
		// my는 나의 위치이다.
		// 내가 도로위에 있으면 도로위.. 도로위가 아니라면 도로가 아님이라고 출력하시오
		
		int a = 10;
		int b = 20;
		int my = 18;
		int disA = my-a;
		int disB = b-my;
		
		if (a <= my && my <= b) {
			System.out.println("도로위");
		}else {
			System.out.println("도로가 아님");
		}
		
		// up1 만약 내가 도로위라면 a지점으로 부터 5(my 위치에 따라 달라짐)만큼 떨어져 있습니다 라고 출력하시오
		
		if (a <= my && my <= b) {
			System.out.println("a 지점으로부터 "+disA+"만큼 떨어져 있습니다.");
		}else {
			System.out.println("도로가 아님");
		}
		
		// up2 up1에서 현재 my의 위치가 가까운 쪽 기준으로 출력한다
		// 예를 들어 my 18이면 b에 더 가까우니 b에서 부터 2거리에 있습니니다.
		if (a <= my && my <= b) {
			if((b+a)/2 > my) {
				System.out.println("a 지점으로부터 "+disA+"만큼 떨어져 있습니다.");
			}else {
				System.out.println("b 지점으로부터 "+disB+"만큼 떨어져 있습니다.");
			}
		}else {
			System.out.println("도로가 아님");
		}

	}

}
