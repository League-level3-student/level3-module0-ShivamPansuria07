package _01_Simple_Array_Algorithms;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		String[] names = new String[5];

		names[0] = "Jan";
		names[1] = "Sara";
		names[2] = "Fred";
		names[3] = "Marc";
		names[4] = "Randy";
		randomOrder(names);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static String printStringArray(String[] values) {
		System.out.println(Arrays.toString(values));
		return Arrays.toString(values);

	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static String printReverseArray(String[] values2) {
		for (int i = 0; i < values2.length; i++) {
			values2 = new String[i];

			int f = values2.length;
			values2[i] = values2[f - 1];
			
		}
		return values2.toString();

	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static String everyOtherWord(String[] values3) {
		for (int i = 0; i < values3.length; i++) {
			String a = values3[i];
			
if(i%2==0) {
	System.out.println(values3[i]);
}
				
		}
		return null;

	}
	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static String randomOrder(String[] values4) {
		
		for (int i = 0; i < values4.length; i++) {
			Random rand = new Random();
			 int num = rand.nextInt(values4.length);
		
			 System.out.println(values4[i]=values4[num]);
			 
				String val0 = values4[0];
				String val1 = values4[1];
				String val2 = values4[2];
				String val3 = values4[3];
				String val4 = values4[4];
				if(val0==val1 && val0==val2 &&val0==val3 &&val0==val4) {
					 System.out.println(values4[0]=values4[num]);
				}
				if(val1==val0 && val1==val2 &&val1==val3 &&val1==val4) {
					 System.out.println(values4[1]=values4[num]);
				}
				if(val2==val0 && val2==val3 &&val2==val4 &&val2==val1) {
					 System.out.println(values4[2]=values4[num]);
				}
				if(val3==val0 && val3==val1 &&val3==val2 &&val3==val4) {
					 System.out.println(values4[3]=values4[num]);
				}
				if(val4==val0 && val4==val1 &&val4==val2 &&val4==val3) {
					 System.out.println(values4[4]=values4[num]);
				}
			
			
		}
		return "";
	}
}
