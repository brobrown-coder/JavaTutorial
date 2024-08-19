package Test_2For;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q4
		//		*******
		//		0*****
		//		00***
		//		000*
		
		for(int i = 4; i > 0; i--) {
			for(int k = 3; k > k%i; k--) {
				System.out.print("0");
			}
			for(int j = 1; j < i*2 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
