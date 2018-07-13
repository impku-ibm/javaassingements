package helloworld;
import java.util.Scanner;
public class assingementQ5 {

	public static void main(String[] args) {
		       Scanner scanner = new Scanner(System.in);

		       System.out.println("Enter a string of numbers: ");
		       String input = scanner.nextLine();

		       String numbers[] = input.split("\\s");
		       int sum = 0;

		       for (String number : numbers) {
		           int n = 0;

		           try {
		               n = Integer.parseInt(number);
		           } catch (NumberFormatException e) {
		               System.out.println("Please enter only integers as input");
		           }

		           sum += n;
		       }

		       System.out.println("Sum of numbers is " + sum);
		   }

		}
	