package j07_반복.랜덤;

public class Random1 {

	public static void main(String[] args) {
		
		double rNum = Math.random();
		System.out.println(rNum);
		
		int i = 0;
		while (i < 10) {
			double rNum2 = Math.random();
			System.out.println((int)(rNum2*10));
//			소수점 첫째자리만
			i++;
		}
		
	}

}
