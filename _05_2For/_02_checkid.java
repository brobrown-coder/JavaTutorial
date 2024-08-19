package _05_2For;

public class _02_checkid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "abc*";
		String sign = "*^$";
		
		for(int i = 0; i < sign.length(); i++) {
			for(int j = 0; j < id.length(); j++) {
				if(sign.charAt(i) == id.charAt(j)) {
					System.out.println("id에 특수문자가 포함됨");
				}
			}
		}
	}

}
