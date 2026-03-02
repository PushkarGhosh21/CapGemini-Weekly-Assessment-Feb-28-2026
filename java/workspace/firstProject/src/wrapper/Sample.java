package wrapper;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to validate:");
        String s = sc.nextLine();
        if (s.isEmpty()) {
            System.out.println("Not a Number (Empty)");
            return;
        }
        boolean isValid = true;
        int start = 0;

        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            start = 1;
            if (s.length() == 1) isValid = false;
        }
        for (int i = start; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Not a Number");
        }
    }
}