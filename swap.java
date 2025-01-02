public static void swap(int[][] array, int row1, int col1, int row2, int col2) {
    int temp = array[row1][col1];
    array[row1][col1] = array[row2][col2];
    array[row2][col2] = temp;
}

public static void main(String[] args) {
    int[][] matrix = {{5, 3, 7, 8}, {7, 8, 1, 9}, {4, 2, 7, 3}, {2, 5, 6, 1}};

    // Swap elements
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (j == matrix[i].length - 1) {
                // Swap the last column element of the current row with the first
                swap(matrix, i, j, i, 0);
            }
        }
    }

    // Print the matrix
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}