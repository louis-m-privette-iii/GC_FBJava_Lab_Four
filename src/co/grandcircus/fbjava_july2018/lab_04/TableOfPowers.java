package co.grandcircus.fbjava_july2018.lab_04;

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum = 0;

		System.out.printf("Enter a number: ");
		userNum = scnr.nextInt();
		
		//test
		System.out.printf("userNum is: " + userNum);
		
		scnr.close();
	}

}
