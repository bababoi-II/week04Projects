package week04CodingProject;

import java.util.Arrays;


public class week04 {

	public static void main(String[] args) {
		//1.)
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		//subtraction. 3.) and 4.) Where "-1" array length is the last position and "0" is the first position.
		int subtract = ages[ages.length - 1] - ages[0];
		System.out.println(subtract);
		
		//second array
		int[] ages2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int subtraction = ages2[ages2.length - 1] - ages2[0];
		System.out.println(subtraction);
		//to calculate a average I need to follow the formula where I add every number and divide.
		//making a for loop to add every number.
		int sum = 0;
		for(int i = 0; i < ages2.length; i++) {
					sum += ages2[i];
				}
		//finally I get to divide to find the average of ages2 array.
		int average = 0;
		average = sum/ages2.length;
		System.out.println(average);
		
		//2.)
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int sumOfLetters = 0;
		for(String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);
		
		//Using a loop to concatenate names with spaces.
		StringBuilder concatenatedNames = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			concatenatedNames.append(names[i]);
			if (i < names.length - 1) {
				concatenatedNames.append(" ");
			}
		}
		System.out.println(concatenatedNames.toString());
		
		//5.)
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		
		//6.)
		int sum2 = 0;
		for(int length : nameLengths) {
			sum2 += length;
		}
		System.out.println(sum2);

		
		//7.)
		//usage of the method
		String result = concatenateWord("Hello", 3);
		System.out.println(result);
		
		//8.)
		String fulName = fullName("Cesar", "Gutierrez");
		System.out.println(fulName);
		
		//9.)
		int[] numbers = {50,60, 10, 20};
		
		boolean results = sumGreaterThan100(numbers);
		System.out.println(results);
		
		//10.)
		double[] numberTen = {10.5, 15.0, 20.5, 25.0};
		double averageTen = calculateAverage(numberTen);
		System.out.println(averageTen);
		
		//11.)
		double [] array1 = {10.5, 15.0, 20.5, 25.0};
		double [] array2 = {1.25, 1.50, 1.75, 2.00};
		
		boolean resultBoolean = firstAverageGreater(array1, array2);
		System.out.println(resultBoolean);
		
		//12.)
		System.out.println(willBuyDrink(true, 11.00));
		
		//13.)
		System.out.println("2 + 2 = " + addTwoPlusTwo());
	
		
		
	}
	
	//13.)
    public static int addTwoPlusTwo() {
        return 2 + 2;
    }
	
	
	//12.)
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket >= 10.50;
	}
	
	//11.)
	//method is to check if the average of the first array is greater than the second array
	public static boolean firstAverageGreater(double[] array1, double[] array2) {
	//calculate the averages using helper method
		double avg1 = calculateAverage(array1);
		double avg2 = calculateAverage(array2);
		
		return avg1 > avg2;
	}
	
	//This method helps to calculate the average of an array
	public static double arrayAverageOneOrTwo(double[] array) {
		if (array.length == 0) {
			return 0;
		}
		double sum = 0;
		for(double num : array) {
			sum += num;
		}
		return sum / array.length;
	}
	
	
	//10.)
	public static double calculateAverage(double[] array) {
		if(array.length == 0) {
			return 0;
		}
		double sum = 0;
		
		for (double num : array) {
			sum += num;
		}
		return sum/array.length;
		
		
	}
	
	
	//7.)method to concatenate the word n times
	public static String concatenateWord(String word, int n) {
		StringBuilder result = new StringBuilder();
		
	//concatenate the word n times
		for(int i = 0; i < n; i++) {
			result.append(word);
		}
	//return the result to string
		return result.toString();
		}
	
	//8.)
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//9.)
	public static boolean sumGreaterThan100(int[] array) {
	int sum = 0;
	
	for(int num: array) {
		sum += num;
	}
	return sum > 100;
}
	}


