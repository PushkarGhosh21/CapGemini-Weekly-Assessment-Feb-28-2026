package banking_transaction_engine;

import java.util.Scanner;
import java.util.InputMismatchException;

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountDetails account = null;

        System.out.println("--- WELCOME TO SECURE BANKING SYSTEM ---");

        while (account == null) {
            try {
                System.out.println("\nSelect Account Type to Create:");
                System.out.println("1. Savings Account");
                System.out.println("2. Current Account");
                System.out.print("Enter Choice: ");
                int type = sc.nextInt();
                
                System.out.print("Enter Account Number: ");
                long accNo = sc.nextLong();
                sc.nextLine(); 
                System.out.print("Enter Account Holder Name: ");
                String name = sc.nextLine();
                
                System.out.print("Set a 4-digit PIN: ");
                long pin = sc.nextLong();
                
                System.out.print("Enter Initial Balance: ");
                double balance = sc.nextDouble();

                if (type == 1) {
                    account = new SavingsAccount(accNo, name, pin, balance);
                } else if (type == 2) {
                    System.out.print("Enter Overdraft Limit: ");
                    double overdraft = sc.nextDouble();
                    account = new CurrentAccount(accNo, name, pin, balance, overdraft);
                } else {
                    System.out.println("Invalid Selection. Try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input format. Please enter numbers where required.");
                sc.nextLine(); 
        }

        System.out.println("\nAccount Created Successfully!");
        account.displayAccountType();

        boolean running = true;
        while (running) {
            try {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose Operation: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1: 
                        System.out.print("Enter PIN: ");
                        long dPin = sc.nextLong();
                        System.out.print("Enter Amount to Deposit: ");
                        double dAmount = sc.nextDouble();
                        account.deposit(dPin, dAmount);
                        break;

                    case 2:
                        System.out.print("Enter PIN: ");
                        long wPin = sc.nextLong();
                        System.out.print("Enter Amount to Withdraw: ");
                        double wAmount = sc.nextDouble();
                        account.withdraw(wPin, wAmount);
                        break;

                    case 3:
                        System.out.println("Current Balance: " + account.checkBalance());
                        break;

                    case 4: 
                        System.out.println("Thank you for banking with us.");
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid Option.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                sc.nextLine(); 
            } catch (Exception e) {
              
                System.out.println("TRANSACTION FAILED: " + e.getMessage());
            }
        }
        
        sc.close();
    }
}}