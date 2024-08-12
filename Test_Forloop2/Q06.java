package Test_Forloop2;

public class Q06 {

	public static void main(String[] args) {
//		String a ="23-56+45*2-56";
//		수식을 계산하는 프로그램을 작성하세요.
//		수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
//		지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다. 
//		메서드는 최대한 적게 사용하세요
		
		String a ="23-56+45*2-56";
		//a자료형은 문자열이다.. 23은 문자열로 가져온다.. 이걸 더하거나 빼거나 한다면 문자열을 더할 수 있을까?
		//힘들다..a 23이 문자가 아니라 숫자라면
		
		
		int sum = 0;
		String tt = "";
		for(int i = 0; i < a.length(); i+=2) {
			int temp=0;
			char aaa = a.charAt(i);
			temp=(aaa-48)*10;
			System.out.println(temp);
			aaa = a.charAt(i+1);
			temp=temp+(aaa-48);
			System.out.println(temp);
					
					
		}
//		System.out.println("");
//		System.out.print((char)sum);
//		
		// 다시확인 필요
		// 
	}

}
