package Lab_Workbook;
import java.util.Scanner;
// Create an array of integer with size n. Return the difference between the largest and the smallest value
// inside that array.

public class exp_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = Integer.parseInt(sc.next());
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The maximum element is " + max);
        System.out.println("The minimum element is " + min);
        System.out.println("The difference between maximum and minimum elements is " + Math.abs(max - min));
    }
}
