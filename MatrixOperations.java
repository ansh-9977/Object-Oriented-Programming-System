import java.util.Scanner;

public class MatrixOperations {
    int[][] matrix1;
    int[][] matrix2;
    int rows1, cols1, rows2, cols2;

    public MatrixOperations() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns for Matrix 1: ");
        rows1 = sc.nextInt();
        cols1 = sc.nextInt();

        matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter rows and columns for Matrix 2: ");
        rows2 = sc.nextInt();
        cols2 = sc.nextInt();

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible! (cols1 ≠ rows2)");
            System.exit(0);
        }

        matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
    }

    int[][] multiply() {
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixOperations mo = new MatrixOperations();
        int[][] result = mo.multiply();
        System.out.println("Resultant Matrix:");
        mo.printMatrix(result);
    }
}
