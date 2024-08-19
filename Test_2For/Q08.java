package Test_2For;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5}   -이중 for  사용
		//		애니팡 게임의 일부분인다. 게임의 캐릭터는 숫자로 구분한다.
		//		가로에 같은 캐릭터가 3개 이상이면 제거 대상이다.
		//		제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 모두 출력하시오.
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		for(int i = 0; i < pang.length; i++) {
			if(pang[i] != pang[i+1]) {
				continue;
			}
		}
	}

}
