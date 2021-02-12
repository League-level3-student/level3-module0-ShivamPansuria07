package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		// 1. declare and Initialize an array 5 Strings
		String[] array = new String[5];

		array[0] = "Jan";
		array[1] = "Sara";
		array[2] = "Fred";
		array[3] = "Marc";
		array[4] = "Randy";
		// 2. print the third element in the array
		for (int i = 0; i < array.length; i++) {
			String a = array[i];
			System.out.println(array[3]);

			// 3. set the third element to a different value
			array[3] = "new name";
			// 4. print the third element again
			System.out.println(array[3]);

			// 5. use a for loop to set all the elements in the array to a string
			// of your choice
       a.contentEquals("Jordan");
              

			// 6. use a for loop to print all the values in the array
			// BE SURE TO USE THE ARRAY'S length VARIABLE
               System.out.println(array.length);
		}
			// 7. make an array of 50 integers
               int[] integers = new int[51];
                                      
			// 8. use a for loop to make every value of the integer array a random
			// number
                 for (int i = 0; i < integers.length; i++) {
                	 Random rand = new Random();
                	 int randoms = rand.nextInt(51);
                	 for (int nums = 0; nums < 51; nums++) {
                		 integers[nums] = randoms;
					}
                	
					
				
			// 9. without printing the entire array, print only the smallest number
			// on the array
                	 int a = integers[i];
                	 if(integers[i]==1) {
                		 
                		 System.out.println(integers[i]);
                		
                	 }

			// 10 print the entire array to see if step 8 was correct
             System.out.println(a);
			// 11. print the largest number in the array.
             if(integers[i]==50) {
        		 
        		 System.out.println(integers[i]);
        		
        	 }
			// 12. print only the last element in the array
            System.out.println(integers[50]); 
             
                 }

		
	}
}
