public class array2 {
public static void main(String[] args) {
    int[][] matrix ={
        {2 , 5 , 3, 6},
        {1 , 3 , 2, 5},
        {6 , 8 , 2, 9}
        //ksjsdjs

       };
       System.out.println("the printed matrix is:");
       for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
       }
    }
    
}

