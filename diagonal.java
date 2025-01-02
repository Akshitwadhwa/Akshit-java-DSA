public class diagonal {
    public static void main(String[] args) {
        int[][] matrix ={
            {5 , 3 , 7, 8},
            {7 , 8 , 1, 9},
            {4 , 2 , 7, 3},
            {2 , 5 , 6, 1}
        };

        System.err.println("this is the diagonal:");
        int n = Math.min(matrix.length , matrix[0].length);
        for (int i =0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");

        }
        System.out.println();

        }
      
    }
