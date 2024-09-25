package September_25_2024;

public class third_sorted_array_ques {
    private final int[] array;
    private int size;

    public third_sorted_array_ques() {
        array = new int[10];
        size = 0;
    }

    public void addToArray(int n) {
        if (size == array.length) {
            System.out.println("Array is full");
            return;
        }

        int i;
        for (i = size - 1; i >= 0 && array[i] > n; i--) {
            array[i + 1] = array[i];
        }
        array[i + 1] = n;
        size++;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        third_sorted_array_ques sortedArray = new third_sorted_array_ques();

        sortedArray.addToArray(5);
        sortedArray.addToArray(3);
        sortedArray.addToArray(9);
        sortedArray.addToArray(1);
        sortedArray.addToArray(7);

        sortedArray.printArray();
    }
}
