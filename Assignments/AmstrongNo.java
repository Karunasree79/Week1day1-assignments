package Assignments;

public class AmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int original = 700;
		int original1 = original;
		int remainder=0;
		

		while (original1 != 0) {
			int calculated = 0;

			calculated = calculated + original1 % 10;

			remainder = remainder + (calculated * calculated * calculated);
			original1 = original1 / 10;
			
		}
		if (remainder == original)
			System.out.println(original + " is an Amstrong number");
		else
			System.out.println(original + "-- not an Amstrong number");

	}

}
