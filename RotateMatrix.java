public class RotateMatrix {
    public static void main(String[] args) {
int[][] matrix={
    {1,2,3},
    {4,5,6},
    {7,8,9},
    };

	// putting in the commands to print the matix in the clockwise

		   for(int i=0;i<matrix.length;i++)
			  {
				  for(int j=matrix[i].length-1;j>=0;j--)
				  {
					  System.out.print(matrix[j][i]+" ");
				  }
				  System.out.println();
			  }
			}
		}
	
		