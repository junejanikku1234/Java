import java.util.Stack;

public class Testing {
    public static void main(String[] args) {
        // Example sentence
        String sentence = "Hello, how are you?";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Create a stack to hold the words
        Stack<String> stack = new Stack<>();

        // Push all words onto the stack
        for (String word : words) {
            stack.push(word);
        }

        // Pop all words from the stack and form the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedSentence.append(stack.pop()).append(" ");
        }

        // Trim the final sentence and print
        System.out.println("Reversed Sentence: " + reversedSentence.toString().trim());
    }
}
