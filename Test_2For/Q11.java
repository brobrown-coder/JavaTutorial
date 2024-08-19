package Test_2For;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <5; i ++) {
			for(int j = 3; j >= i ; j--) {
				System.out.print("0");
			}
			for(int k = 1; k < i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 3; i > 0; i--) {
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
