package firstProject;
import java.util.Scanner;
public  class Sircalculator {
	static Scanner userInput=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			Expression expression=inputs();
			switch(expression.operator)
			{
			case '+':
				break;
			case '-':
				break;
			case '*':
				break;
			case '/':
				break;
			default:
				System.out.println("INVALID OPERATOR !!!");
			toContinue();
			}
			
		}while(true);
       
	}
	public static Expression inputs()
	{
		
		Expression expression=new Expression();
		System.out.print("Enter operand 1:");
		expression.operand1=userInput.nextDouble();
		userInput.nextLine();
		System.out.print("Enter operator + - * /:");
		expression.operator=userInput.next().charAt(0);
		System.out.print("Enter operand 1:");
		expression.operand2=userInput.nextDouble();
		userInput.nextLine();
		return expression;
	}

	public static void toContinue() {
		
		System.out.print("To continue enter y:");
		char selection=userInput.next().charAt(0);
		if(selection!='y')
		{
			System.out.println("---EXIT---");
			System.exit(0);
		}
		}
	}
      public static void addition(Expression expression)
      
 class Expression{
	 double operand1,operand2;
	 char operator;
 }
 