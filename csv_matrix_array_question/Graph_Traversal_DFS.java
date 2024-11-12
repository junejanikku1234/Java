package csv_matrix_array_question;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Graph_Traversal_DFS {
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

                int row = Integer.parseInt(values[0].trim()) - 1;
                int col = Integer.parseInt(values[1].trim()) - 1;
                int data = Integer.parseInt(values[2].trim());

                matrix[row][col] = data;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            return;
        }

        boolean[] visited = new boolean[max_row + 1];
        Stack<Integer> stack = new Stack<>();

        stack.push(1);

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (visited[current]) {
                continue;
            }

            visited[current] = true;
            System.out.print(current + " ");

            for (int i = 1; i <= max_row; i++) {
                if (matrix[current - 1][i - 1] != 0 && !visited[i]) {
                    stack.push(i);
                }
            }
        }
    }
}