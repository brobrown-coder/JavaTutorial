package Test_2For;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Q2	
		//		*****
		//		****
		//		***
		//		**
		//		*
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
