package July_31_2024;
import java.util.Scanner;

public class string_reversal {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = con.nextLine();
        char[] chararr = str.toCharArray();
        char[] reversed = new char[chararr.length];
        for(int i=0; i< chararr.length; i++){
            reversed[i] = chararr[chararr.length - i - 1];
        }
        String output = String.valueOf(reversed);
        System.out.println("The reversed string is: " + output);
    }
}
