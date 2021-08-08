package Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum=0,secNum=1,range=8,sum;
		System.out.println(0);
		for (int i = 0; i <=range; i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			
			System.out.println(sum);
		}
	}

}
