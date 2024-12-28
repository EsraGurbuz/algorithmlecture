/*******************************************************************
@Title:	    GurbuzEsraAlgorithm&ProgrammingPugDogClub
@Purpose:	To learn the methods and array in Java.
@Author:    Gurbuz Esra
@Date:   	12.28.2024 28th of December 2024
@Version:	1.0
********************************************************************/

import java.util.Random;

public class GurbuzEsraLab9{
	public static void main(String[] args){

		Random myRandomNo = new Random();

		int[][] population = new int[4][6];
		boolean[] endangeredSpecies = new boolean[4];


		int total = 0;
		int stateSpeciesCount = 0;
		int speciesStateCount = 0;

		for(int species = 0; species < 4; species++){
			for(int states = 0; states < 6; states++){
				int random = myRandomNo.nextInt(11);
				population[species][states] = random;
				System.out.print(population[species][states] + " ");

				total = total + population[3][states];

			}
			System.out.println();
		}
		System.out.println("Last species has " + total + " total population in all 6 states.");

		for(int states = 0; states < 6; states++){
			stateSpeciesCount = 0;

			for(int species = 0; species < 4; species++){
				if(population[species][states] != 0){

					stateSpeciesCount++;
				}
			}
			System.out.println((states+1) + " states has " + stateSpeciesCount + " different species.");
		}

		for(int species = 0; species < 4; species++){
			speciesStateCount = 0;
			for(int states = 0; states < 6; states++){
				if(population[species][states] != 0){
					speciesStateCount++;
				}
			}
			if(speciesStateCount <= 3){
				endangeredSpecies[species] = true;
			}
		}

		for(int species = 0; species < 4; species++){
			if(endangeredSpecies[species]){
				System.out.println("Species " + (species + 1) + " is endangered.");
			}
		}
	}
}