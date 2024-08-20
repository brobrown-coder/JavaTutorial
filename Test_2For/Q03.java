package Test_2For;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Q3
		//		000*
		//		00***
		//		0*****
		//		*******
		
//		for(int i = 1; i <5; i ++) {
//			for(int j = 3; j >= i ; j--) {
//				System.out.print("0");
//			}
//			for(int k = 1; k < i*2; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i < 4; i ++) {
			for(int j = 0; j < 4+i; j++) {
				if(j < 3-i) {
					System.out.print("0");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
