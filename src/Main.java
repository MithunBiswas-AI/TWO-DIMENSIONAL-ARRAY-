
public class Main {
    public static void main(String[] args) {


        int[][] matrix = new int[10][10];

        // Filling the array with values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // If on the diagonal, put the numbers from 0 to 9
                if (i == j) {
                    matrix[i][j] = i;
                } else {
                    // Otherwise, fill with 0
                    matrix[i][j] = 0;
                }
            }
        }


        System.out.println("Matrix:");
        printMatrix(matrix);


        int diagonalSum = calculateDiagonalSum(matrix);


        System.out.println("Sum of elements on the diagonal: " + diagonalSum);
    }


    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }


    private static int calculateDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;

    }
}