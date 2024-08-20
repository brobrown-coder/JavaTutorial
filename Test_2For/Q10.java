package Test_2For;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q10	난건물주  <이중For사용>
		//		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
		//		int size=2;
		//		arr 배열에서 0이 의미하는 것은 공터이다. 
		//		size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		//		size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		//		size가 2일경우에 7개이다. 
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;
		int cntZero = 0;
		int cntStruc = 0;
		int sumStruc = 0;
		for(int i =0; i < arr.length; i++) {
			cntStruc = 0;
			cntZero = 0;
			if(arr[i] == 0) {
				for(int j = i; j <arr.length; j++) {
					if(arr[i] == arr[j]) {
						cntZero++;
					}else {
						break;
					}
				}
				for(int k = 0; k <= cntZero; k++) {
					if((cntZero-k-size) >= 0) {
						cntStruc++;
					}
				}
				sumStruc += cntStruc;
				i = i+cntZero-1;
			}
		}
		System.out.println("건물의 크기가 "+size+"만큼일때 "+sumStruc+"개의 건물을 지을 수 있다");
	
	}
}
