package TestPM;

public class test03 {

	public static void main(String[] args) {
		// Q1
		double aver = 89.2;
		if(aver >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// Q2
		int level = 2;
		int point = 30;
		if(level == 1) {
			point += 30;
		}else {
			point += 10;
		}
		System.out.println(point);
		
		// Q3
		int[] lotto = {6,12,33,4,5,26};
		lotto[2] += 80;
		System.out.println(lotto[2]);
		
		// Q4
		int[] lottoNew = {6,12,33,4,5,26};
		if(lottoNew[3]%2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		// Q5
		int sum = 0;
		if(lottoNew[0]%2 == 1) {
			sum += lottoNew[0];
		}
		if(lottoNew[1]%2 == 1) {
			sum += lottoNew[1];
		}
		if(lottoNew[2]%2 == 1) {
			sum += lottoNew[2];
		}
		if(lottoNew[3]%2 == 1) {
			sum += lottoNew[3];
		}
		if(lottoNew[4]%2 == 1) {
			sum += lottoNew[4];
		}
		if(lottoNew[5]%2 == 1) {
			sum += lottoNew[5];
		}
		System.out.println(sum);
		
		// Q6
		int[] a = {45,34,64,45,24};
		System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
		
		// Q7
		int[] Num = {45,34,64};
		
		if(Num[0]/10 + Num[0]%10 >Num[1]/10 + Num[1]%10) {
			if(Num[0]/10 + Num[0]%10 > Num[2]/10 + Num[2]%10) {
				System.out.println(Num[0]);
			}else{
				System.out.println(Num[2]);
			}
		}else {
			if(Num[1]/10 + Num[1]%10 > Num[2]/10 + Num[2]%10) {
				System.out.println(Num[1]);
			}else {
				System.out.println(Num[2]);
			}
		}
		
		// Q8
		int[] x = {6,5,9};
		int[] y = {4,10,6};
		int gunX = 3;
		int gunY = 2;
		String bird0 = "0번";
		String bird1 = "1번";
		String bird2 = "2번";
		if ((x[0] % gunX != 0) || (y[0] % gunY !=0)) {
			bird0 = null;
		}
		if ((x[1] % gunX != 0) || (y[1] % gunY !=0)) {
			bird1 = " ";
		}
		if ((x[2] % gunX != 0) || (y[2] % gunY !=0)) {
			bird2 = null;
		}
		System.out.println("총알에 맞는 새는"+bird0+bird1+bird2+"이다.");
		
		
		// Q9
		int[] enemy = {10, 20, 5, 6};
		int[] misile = {11, 5, 2, 2};
		
		if (enemy[0] <= misile[0] && misile[0]+misile[2] <= enemy[0]+enemy[2]) {
			if(enemy[1] <= misile[1]+misile[3] && misile[1] <= enemy[1]+enemy[3]) {
				System.out.println("목표에 Hit했습니다");
			}
			else {
				System.out.println("빗나갔습니다");
			}
		}
		else {
			System.out.println("빗나갔습니다");
		}
	}

}
