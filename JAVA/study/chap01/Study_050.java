package Study_chap01;

public class Study_050 {

	public static void main(String[] args) {
	
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);

	}

}
