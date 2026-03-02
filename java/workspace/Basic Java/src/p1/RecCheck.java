package p1;
public class RecCheck {
    private static int count = 0;

    public static void recursiveCall() {
        count++;
        recursiveCall(); // Recursive call without base case
    }

    public static void main(String[] args) {
        try {
            recursiveCall();
        } catch (StackOverflowError e) {
            System.err.println("Stack Overflow reached!");
            System.err.println("Total function calls: " + count);
        }
    }
}

