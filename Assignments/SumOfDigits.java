package Assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int number = 123;
		int sum = 0;
		while (number != 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		System.out.println("The sum of digits is " + sum);
	}

}
