package studio3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("Pick the Range (including the number):"); 
		int range = in.nextInt(); 

		int[]numbers = IntStream.rangeClosed(2, range).toArray(); 

		for (int i=2; i <= numbers.length; i++) {
			for (int n = 2; n <= numbers.length + 1; n++) {
				if (n%i == 0 && n!= i) {
					numbers[n-2] = 0;
				}
			}
		}
		System.out.println("Your prime numbers are:");

		for (int element : numbers) {
			if(element != 0) {
				System.out.println(element);
			}
		}
	}

}
