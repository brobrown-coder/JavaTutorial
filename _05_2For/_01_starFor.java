package _05_2For;

public class _01_starFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j = 0; j < 4; j ++) {
			for(int i = 0; i < 3 ; i++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
