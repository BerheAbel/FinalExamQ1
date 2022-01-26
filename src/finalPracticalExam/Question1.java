package finalPracticalExam;

import java.util.Random;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner ui = new Scanner(System.in);// Accept user input
		Random randomnumber = new Random();// Randomizing numbers

		int x = ui.nextInt();
		int smallest = x;
		// iterating starting from user given number up to 500
		for (int i = 0; i < 500; i++) {
			System.out.println(randomnumber.nextInt(500));
			if (randomnumber.nextInt(500) < smallest) {
				smallest = randomnumber.nextInt(500);
			}
		}
		System.out.println("the smallest number is" + smallest);
	

}

}
