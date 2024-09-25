package September_25_2024;
import java.util.*;

public class fourth_integer_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] arr = new int[n];
        int[] cumulative = new int[n-1];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        cumulative[0] = arr[0] + arr[1];
        for (int i = 1; i < n-1; i++) {
            cumulative[i] = cumulative[i-1] + arr[i+1];
        }

        System.out.println("The original array is: " + Arrays.toString(arr));
        System.out.println("The cumulative array is: " + Arrays.toString(cumulative));
    }
}
