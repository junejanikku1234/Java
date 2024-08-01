package July_31_2024;
import java.util.Random;

public class sequential_search {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);
    }
}
