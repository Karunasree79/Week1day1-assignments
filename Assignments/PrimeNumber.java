package Assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=15;
		boolean flag = false;
		for (int i = 2; i <=number/2; i++) {
			if(number%i==0) {
				flag=true;
			
		}
		}
if(!flag)
	System.out.println("It is prime number");
	else
		System.out.println("It is not prime number");
		
}
}
