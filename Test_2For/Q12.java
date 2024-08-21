package Test_2For;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 11번 문제에서 for문 2개만 사용하기 if문은 갯 수 상관없음.
		System.out.println("000*");
		System.out.println("00***");
		System.out.println("0*****");
		System.out.println("*******");
		System.out.println("0*****");
		System.out.println("00***");
		System.out.println("000*");
		
		System.out.println(" ");
		
		int tempi=0;
		for (int i = 0; i < 7; i++) {
			tempi = 3-i;
			if(tempi < 0) {
				tempi *= -1;
			}
			//System.out.println(tempi);
			for (int j = 0; j < 4 + (3-tempi); j++) {
				if (j >= 4 - (3-tempi) -1) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
