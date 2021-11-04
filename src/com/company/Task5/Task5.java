package com.company.Task5;

public class Task5 {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        int[][] matrix = new int[m][n];
        int[][] tmatrix = new int[n][m];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = n * i + j;
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        int temp;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0;j<n;j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = tmatrix[j][i];
                tmatrix[j][i]= temp;
            }
        }
        System.out.println();
        System.out.print("------------------------------- ");
        System.out.println();
        System.out.print(" Transposed matrix: ");
        System.out.println();
        for (int j = 0;j<n;j++)
        {
            for (int i = 0;i<m;i++)
            {
                System.out.print(" " + tmatrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
