package csv_matrix_array_question;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Matrix_Builder {
    public static void main(String[] args) {
        int max_row = 0;
        int max_col = 0;

        try {
            File file = new File("csv_matrix_array_question/matrix_data.csv"); // Replace path with your file
            Scanner sc = new Scanner(file);
            sc.useDelimiter(",");

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] values = line.split(",");

                int row = Integer.parseInt(values[0].trim());
                int col = Integer.parseInt(values[1].trim());

                if (row > max_row) max_row = row;
                if (col > max_col) max_col = col;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return;
        }

        int[][] matrix = new int[max_row][max_col];

        try {
            File file = new File("csv_matrix_array_question/matrix_data.csv"); // Replace path with your file
            Scanner sc = new Scanner(file);
            sc.useDelimiter(",");

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] values = line.split(",");

                int row = Integer.parseInt(values[0].trim())-1;
                int col = Integer.parseInt(values[1].trim())-1;
                int data = Integer.parseInt(values[2].trim());

                matrix[row][col] = data;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            return;
        }

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
