package PAT.Day3;

public class Stack_BalancedPar {

    private int maxSize = 7; // number of items in stack
    private char[] stackArray = new char[maxSize];
    private int top; // top of stack

    public void push(char s) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            stackArray[top] = s;
        }
    }

    public void pop(char s) {
        if (top != -1) {
            stackArray[top--] = s;
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void print() {
        for (int i = 0; i <= top; ++i) {
            System.out.print((stackArray[i]));
        }
    }

    public boolean isEqual(char ch) {
        return ((stackArray[top] == '(' && ch == ')') || (stackArray[top] == '{' && ch == '}'))
                || (stackArray[top] == '[' && (ch == ']'));
    }

    public static void main(String[] args) {
        Stack_BalancedPar stack = new Stack_BalancedPar();

        String s = "({[()]})";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (stack.isEqual(s.charAt(i))) {
                    stack.pop(s.charAt(i));
                } else {
                    break;
                }
            }
        }

        stack.print();

        if (stack.top != 0) {
            System.out.println("\nString is not balanced");
        } else {
            System.out.println("String is balanced");
        }

    }
}
