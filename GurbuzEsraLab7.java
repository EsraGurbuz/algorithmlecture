/*******************************************************************
@Title:	    GurbuzEsraAlgorithm&ProgrammingOddEven
@Purpose:	To reinforce array, loops, and conditional statements in Java.
@Author:    Gurbuz Esra
@Date:   	12.13.2024 13th of December
@Version:	1.0
********************************************************************/
import java.util.Scanner;
public class GurbuzEsraLab7 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int[] array = new int[10];

		for(int i = 0; i < 10; i++){
			System.out.println("Enter a value:");
			int index = keyboard.nextInt();
			array[i] = index;
		}

		int even = 0;
		int odd = 0;

		int[] evenNumbers = new int[array.length];
		int[] oddNumbers = new int[array.length];
		int evenIndex = 0;
		int oddIndex = 0;

		for(int i = 0; i < array.length; i++){
			int decision = array[i] % 2;
			if(decision == 0){
				evenNumbers[evenIndex++] = array[i];
				even++;
			} else {
				oddNumbers[oddIndex++] = array[i];
				odd++;
			}

		}
		System.out.println("You entered " + even + " even values.");
		System.out.println("These are even values in the array: ");
		for(int i = 0; i < evenIndex; i++){
			System.out.print(evenNumbers[i] + " ");
		}
		System.out.println();

		System.out.println("You entered " + odd + " odd values.");
		System.out.println("These are odd values in the array ");
		for(int i = 0; i < oddIndex; i++){
			System.out.print(oddNumbers[i] + " ");
		}
		System.out.println();
	}
}
