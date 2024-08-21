package Lab_Workbook;
import java.util.*;
// Write a program to read numbers in an integer array of size 5 and display the following:
//Sum of all the elements
//Sum of alternate elements in the array
//Second highest element in the array

public class exp_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers ");
        int all_sum = 0;
        int alt_sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the "+(i+1)+"th number: ");
            arr[i] = Integer.parseInt(sc.next());
            all_sum += arr[i];
        }
        for (int i = 0; i < 5; i++) {
            if (i%2 ==0){
                alt_sum += arr[i];
            }
        }
        Arrays.sort(arr);
        int second_highest = arr[arr.length-2];
        System.out.println();
        System.out.println("The sum of all the numbers is: "+all_sum);
        System.out.println("The sum of all alternate numbers is: "+alt_sum);
        System.out.println("The second highest number is: "+second_highest);
    }
}
