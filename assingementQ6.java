package helloworld;
import java.util.Scanner;
public class assingementQ6 {

	public static void main(String[] args) {
		System.out.println("Enter any Character:-");
		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0);
		if(ch>='a' && ch<='z')  
		{
			System.out.println("Small letter");
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println("Capital letter");
		}
		
		else if(ch>=0 && ch<=9) {
			System.out.println("Digit");
		}
		else 
		{
			System.out.println("Special Character");
		}

	}

}
