import java.util.Scanner;

public class matrix {

    public static void main(String[] args){

        int[][] matrix1;
        int[][] matrix2;

        int rows1, rows2, col1, col2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows for matrix 1: ");
        rows1 = input.nextInt();
        System.out.print("Enter number of columns for matrix 1: ");
        col1 = input.nextInt();

        System.out.print("Enter number of rows for matrix 2: ");
        rows2 = input.nextInt();
        System.out.print("Enter number of columns for matrix 2: ");
        col2 = input.nextInt();

        matrix1 = new int[rows1][col1];
        matrix2 = new int[rows2][col2];

        fillMatrix(matrix1);
        fillMatrix(matrix2);

        displayMatrix(matrix1);

        System.out.println();

        displayMatrix(matrix2);

        System.out.println();

        multiplyMatricies(matrix1, matrix2, rows1, col1, rows2, col2);

    }

    public static void multiplyMatricies(int[][] m1, int[][] m2, int r1, int c1, int r2, int c2){

        if (c1 != r2)
        {
            System.out.println("Matricies not comatable for multiplication");
            return;
        }

        int a = 0, b = 0, i, j;

        int [][]newMatrix = new int[r1][c2];

        for (i = 0; i < r1; i++)
        {
            for (j = 0; j < c2; j++)
            {
                for (a = 0, b = 0; a < c1; a++, b++)
                    newMatrix[i][j] += m1[i][a] * m2[b][j];
            }
        }

        System.out.println("Matrix Multiplication:");
        displayMatrix(newMatrix);

    }

    public static void displayMatrix(int[][] matrix){

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " "); }
            System.out.println();
        }

    }

    public static void fillMatrix(int[][] matrix){

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() * 10); }
        }

    }
}
