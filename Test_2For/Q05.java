package Test_2For;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Q5 int[] a ={34,55,23,56,34,45,34};
		//		40보다 큰 수는 모두 몇개인가?
		int cnt = 0;
		int[] a ={34,55,23,56,34,45,34};
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 40) {
				cnt++;
			}
		}
		System.out.println("40보다큰수는 "+cnt+"개");
		
	}

}
