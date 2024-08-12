package Test_Forloop2;

public class Q04 {

	public static void main(String[] args) {
		/*	난 건물주
		 * 	int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		 * 	int size = 2;
		 * 	arr 배열에서 0이 의미하는 것은 공터이다.
		 *  size 는 건물의 크기이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야한다.
		 *  size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		 *  size 가 2일 경우에 7개이다.
		 */	
		
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size = 2;
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0 && arr[i] == arr[i-1]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
