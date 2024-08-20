package Test_2For;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		Q7 거스름돈 구하기   10000원짜리 0개, 1000원짜리 0 개, 100짜리 0개, 10짜리 0개,   
		//		조건 : /나 %연산자는 각각 최대 두 번씩 사용가능
		//		   단, 거스름돈은 만천원이 최대 값이다. 
		//		int money=4570;  // 가격
		//		int pay = 10000;  //지불금액
		
		// TODO Auto-generated method stub
				int money=4570;  // 가격
				int pay = 10000;  //지불금액
				int rest = pay-money;
				int n = 0;
				int ten = 10;
				System.out.println(rest+"원");
				
				for(int i = 0; i < 3; i++) {
					n = (rest/ten)%10;
					System.out.println(ten+"원 "+n+"개");
					n = 0;
					ten *= 10;
				}

		
		
		
	}

}
