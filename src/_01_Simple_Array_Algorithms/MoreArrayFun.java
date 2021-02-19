package _01_Simple_Array_Algorithms;

import java.util.Random;

import javax.swing.JOptionPane;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static String printStringArray(String[] values) {
		// for (int i = 0; i < values.length; i++) {
		 System.out.println(values.toString());
		// return values[i];
		// }
		return values.toString();

	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static String printReverseArray(String[] values) {
		for (int i = 0; i < values.length; i++) {
			values = new String[i];
			int f = values.length;
			values[1]=values[f];
		}
		return "f";

	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

}
