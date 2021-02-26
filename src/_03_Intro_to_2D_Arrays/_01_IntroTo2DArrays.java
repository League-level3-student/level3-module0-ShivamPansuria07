package _03_Intro_to_2D_Arrays;

public class _01_IntroTo2DArrays {

    public static void main(String[] args) {
        // 1. declare a 2D array of integers with 3, 1D arrays that each hold
        //    3 integers
    	  int[][] Array2d = {{1,2,3}, {4, 5, 6}, {7, 8, 9}};
        // 2. use two for loops to set all the elements in the 2D array to
        //    a different integer
    	  System.out.println(Array2d[1][2]);
    	  Array2d[1][2]=4;
for (int i = 0; i < Array2d.length; i++) {
	for (int j = 0; j < 3; j++) {
		Array2d[0][i]=j;
		Array2d[1][i]=j;
		Array2d[2][i]=j;
		
	}
	
}
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
        
        // 3. print the third element from the second 1D array (2DArray[1][2])

        // 4. set the third element from the second 1D array to a different
        //    value


        // 5. print the element again and verify the value has changed
System.out.println(Array2d[1][2]);
    }
}
