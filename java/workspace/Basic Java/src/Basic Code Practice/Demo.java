package firstProject;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner userInput = new Scanner(System.in);
          System.out.println("Enter 3 digit no:");
          short num = userInput.nextShort();
          //The problem occurs in scanner as when we press enter after inputting
          //the 3 digit number the newline character \n is created and 
          //short is created only to grab the numeric value not the \n
          //so \n is left in input buffer and nextLine is designed to eat 
          //everything until it reaches a new line and it immediately reaches \n
          //eats it and thinking it is finished returns empty string
          userInput.nextLine();//solution as this nextLine statement eats up
                               //the previous newline character \n and the input buffer
                              //becomes empty
          System.out.println(num);
          System.out.println("Enter your name:");
          String name = userInput.nextLine();
          System.out.println(name);
          
	}

}
