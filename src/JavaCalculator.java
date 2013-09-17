
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaCalculator {


public static void main(String[] args)

	   {

	Scanner input = new Scanner( System.in );
	Scanner op = new Scanner (System.in);
	     
	 //Variables
	 
	 int numberOne, numberTwo;
	 String operation;

	 
	 //Process

	 System.out.println("Please enter first number and press ENTER:");

	 numberOne =input.nextInt();
	 
	 System.out.println("Please enter operation type and press ENTER:");
	 
	 operation = op.next();
	        
	 System.out.println("Please enter second number and press ENTER:");

	 numberTwo =input.nextInt();
	 
	 //Output

	 if ( operation.equals("+"))
	 {
	 System.out.printf("Your answer is " + (numberOne + numberTwo));
	 }
	 if ( operation.equals("-"))
	 {
	 System.out.printf("Your answer is " + (numberOne - numberTwo));
	 }
	 if ( operation.equals("*"))
	 {
     System.out.printf("Your answer is " + (numberOne * numberTwo));
	 }
	 if ( operation.equals("/"))
	 {
     System.out.printf("Your answer is " + (numberOne / numberTwo));
	 }
	 }
}
