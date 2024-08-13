package Test_Forloop2;

public class Q99special02 {

	public static void main(String[] args) {
	//		 String a ="67/414/1/23/32/45/54/12/11/232"
	//				 문자열 a는 해충에 대한 숫자를 카운팅한 결과이다.
	//				 해충의 갯수를 모두 합하시오.
	//				 charAt() 메서드만 사용이 가능하다. 
	//				 형변환이 필요하면 검색하여 사용하시오.
		String a ="67/414/1/23/32/45/54/12/11/232";
		a=a+"//"; //a ="67/414/1/23/32/45/54/12/11/232//";
		int result = 0;
		for(int i = 0; i < a.length()-2; i++) {
			char b = a.charAt(i);
			char bb = a.charAt(i+1);
			char bbb = a.charAt(i+2);
			if(b != '/' && bb != '/' && bbb != '/') {
				result += (int)(b-48)*100;
			}else if(b !='/' && bb != '/' && bbb == '/'){
				result += (int)(b-48)*10;
			}else if(b !='/' && bb == '/'){
				result += (int)(b-48);
			}else if(b == '/') {
				result += 0;
			}
		}
		System.out.println(result);
	}

}