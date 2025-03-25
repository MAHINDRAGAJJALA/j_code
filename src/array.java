class array {
    /*
     - Single dimensional array
     - Multi-dimensional array
         - Two-dimensional array 
         - Jagged array  
    */

    // Single dimensional array 
    public static void arraySingle() {
        // Creating an array
        int[] j = new int[5];
        j[0] = 5;
        j[1] = 6;
        j[2] = 8;

        // Printing a single element
        System.out.println("Single element at index 1: " + j[1]);
        
        // Using for loop
        for (int i = 0; i < j.length; i++) {
            System.out.println("Using for loop ---> " + j[i]);
        }

        // Using while loop
        int i = 0;
        while (i < j.length) {
            System.out.println("Using while loop ---> " + j[i]);
            i++;
        }
        
        // Predefined array values
        int[] k = {2, 3, 4, 5, 6, 7}; // inserting data in array
        int[] l = new int[]{2, 3, 4, 5, 6, 7}; // object creation
    }

    // Multi-dimensional array
    public static void multiDimensionalArray() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements
        System.out.println("Element at row 1, column 2: " + matrix[1][2]); // Output: 6

        // Looping through the 2D array
        for (int i = 0; i < matrix.length; i++) { // Rows
            for (int j = 0; j < matrix[i].length; j++) { // Columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Main method
    public static void main(String[] args) {
        arraySingle();
        multiDimensionalArray();
    }
}
