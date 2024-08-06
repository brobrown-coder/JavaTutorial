package TestPM;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		array[0] = 30;
		array[1] = 40;
		array[2] = 50;
		array[3] = 60;
		array[4] = 55;
		
		// Q1
		System.out.println(array[0]+","+array[1]+","+array[2]+","+array[3]+","+array[4]);
		
		String[] familyName = new String[3];
		familyName[0] = "kim";
		familyName[1] = "lee";
		familyName[2] = "park";
		// Q2
		System.out.println(familyName[0]+","+familyName[1]+","+familyName[2]);
		
		int[] lotto = new int[6];
		lotto[0] = 6;
		lotto[1] = 12;
		lotto[2] = 33;
		lotto[3] = 4;
		lotto[4] = 5;
		lotto[5] = 26;
		
		lotto[2] = lotto[2] + 2;
		// Q3
		System.out.println(lotto[2]);
		
		// Q4
		System.out.println(lotto[0]+lotto[2]+lotto[4]);
		
		lotto[0] = lotto[0];
		lotto[1] = lotto[1]+lotto[0];
		lotto[2] = lotto[2]+lotto[1];
		lotto[3] = lotto[3]+lotto[2];
		lotto[4] = lotto[4]+lotto[3];
		lotto[5] = lotto[5]+lotto[4];
		
		// Q5
		System.out.println(lotto[0]+","+lotto[1]+","+lotto[2]+","+lotto[3]+","+lotto[4]+","+lotto[5]);
		
		
		int[] lotto2 = new int[6];
		lotto2[0] = 6;
		lotto2[1] = 12;
		lotto2[2] = 33;
		lotto2[3] = 4;
		lotto2[4] = 5;
		lotto2[5] = 26;
		
		// Q6
		System.out.println(lotto2[3]%2!=0);
		
		
		int money = 2750;
		int pay = 10000;
		int rest = pay-money;
		// Q7
		System.out.println("천원:"+rest/1000+"개"+","+"백원"+rest%1000/100+"개"+","+"십원"+rest%100/10+"개");
		// 7250/1000 > 7.250 > int 7
		// 7250%1000 > 0.250/ 100  int 2
		// 7250%100 > 50 / 10 int 5
		
		
		int xA = 700;
		int yA = 500;
		int xB = 900;
		int yB = 300;
		
		int xC = 650;
		int yC = 150;
		
		boolean value = (xA < xC && xC < xB+3) && (yA > yC && yC> yB+3);
		
		// Q8
		System.out.println(value);
		
	}

}
