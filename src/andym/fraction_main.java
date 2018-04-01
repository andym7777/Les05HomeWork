package andym;

import java.util.Scanner;

public class fraction_main {

	public static void main(String[] args) {
		int len = 0;

		@SuppressWarnings("resource")
		Scanner sck = new Scanner(System.in);
		for (int i = 0; i < 1; i++) {
			System.out.print("Please enter array length K > ");
			if (sck.hasNextInt()) {
				len = sck.nextInt();

			}
		}

		@SuppressWarnings("resource")
		Scanner scm = new Scanner(System.in);
		int[] masnum = new int[len];
		int[] masdenom = new int[len];
		for (int ii = 0; ii < masnum.length; ii++) {
			int s = ii + 1;
			System.out.print("Please enter numerator " + s + " >");
			if (scm.hasNextInt()) {
				masnum[ii] = scm.nextInt();

			}
			System.out.print("Please enter denominator " + s + " >");
			if (scm.hasNextInt()) {
				masdenom[ii] = scm.nextInt();

			}

			fraction a = new fraction(masnum[ii], masdenom[ii]);

			print(a);
		}

	}

	public static void print(fraction a) {
		System.out.println(a);
	}

}
