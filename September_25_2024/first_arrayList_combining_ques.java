package September_25_2024;
import java.util.ArrayList;

public class first_arrayList_combining_ques {
    public static void main(String[] args) {
        ArrayList<String> firstArray = new ArrayList<>();
        ArrayList<String> secondArray = new ArrayList<>();
        ArrayList<String> thirdArray = new ArrayList<>();

        firstArray.add("This is the first Array List.");
        firstArray.add("Sample text for the first array list.");

        secondArray.add("This is the second Array List.");
        secondArray.add("Sample text for the second array list.");

        while(!firstArray.isEmpty()) {
            thirdArray.add(firstArray.removeFirst());
        }
        while(!secondArray.isEmpty()) {
            thirdArray.add(secondArray.removeFirst());
        }
        System.out.println(thirdArray);
    }
}
