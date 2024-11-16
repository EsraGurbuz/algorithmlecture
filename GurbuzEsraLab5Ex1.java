/*******************************************************************
@Title:	    GurbuzEsraAlgorithm&ProgrammingOddEven
@Purpose:	To calculate the even and odd number
@Author:    Gurbuz Esra
@Date:   	11.17.2024 17th of November
@Version:	1.0
********************************************************************/


import java.util.Scanner;

public class GurbuzEsraLab5Ex1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a positive integer");

		int input = keyboard.nextInt();

		while (input < 0) {
			System.out.println("You entered an incorrect value.");
			System.out.println("Re-enter please!");
			input = keyboard.nextInt();
		}

		int decision = input % 2;

		if(decision == 0) {
			System.out.println("You entered an even value.");
		} else {
			System.out.println("You entered an odd value.");
		}
	}
}
