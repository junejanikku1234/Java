package Lab_Workbook;
import java.util.Random;
// Write a program that initializes an array with ten random integers and then prints four lines of output, containing:
//Every element at an even index
//Every odd element
//All elements in reverse order
//Only the first and last element

public class exp_2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        System.out.println("The randomly generated array of size 10 is: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("The elements at even indexes are: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println("At index "+(i)+" "+arr[i]);
            }
        }
        System.out.println();
        System.out.println("All odd elements are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(+arr[i]);
            }
        }
        System.out.println();
        System.out.println("The elements in reverse order are: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("The first element is: " + arr[0]);
        System.out.println("The last element is: " + arr[arr.length - 1]);
    }
}
