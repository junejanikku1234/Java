import java.util.*;

public class Eval_Postfix {

    public int eval_Postfix(String exp) {
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isDigit(c))
                stack.push(Character.getNumericValue(c));

            else {
                int b = stack.pop();
                int a = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '^':
                        stack.push((int)Math.pow(a,b));
                        break;
                    case '%':
                        stack.push(a % b);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        Eval_Postfix test = new Eval_Postfix();
        System.out.println(test.eval_Postfix("452^7%32*+63/-82^++"));
    }
}
