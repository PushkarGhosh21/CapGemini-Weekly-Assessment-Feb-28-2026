package exception_unchecked;
import java.util.Scanner;

class IncorrectPinException extends Exception {
    public IncorrectPinException(String message) {
        super(message);
    }
}

public class SimplePinValidator {
    public static void main(String[] args) {
        String correctPin = "1234"; 
        int maxTries = 3;
        Scanner scanner = new Scanner(System.in);

        for (int attempt = 1; attempt <= maxTries; attempt++) {
            System.out.print("Enter PIN: ");
            String enteredPin = scanner.nextLine();

            try {
               
                if (!enteredPin.equals(correctPin)) {
                    throw new IncorrectPinException("Incorrect PIN entered.");
                }
                
                               System.out.println("Access granted!");
                break; 
                
            } catch (IncorrectPinException e) {
                
                System.out.println(e.getMessage());
                
               
                if (attempt == maxTries) {
                    System.out.println("No more tries.");
                }
            }
        }
        
        scanner.close();
    }
}