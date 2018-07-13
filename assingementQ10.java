package helloworld;
import java.util.Scanner;
public class assingementQ10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string:-");
		String str = input.nextLine();
		
		System.out.println("Enter the number:-");
		int n = input.nextInt();

		System.out.print(str);
		for(int i = 0;i < n;i++) {
			for(int j = str.length()-n; j < str.length();j++) {
				System.out.print(str.charAt(j));
			}
		}
		
		
	}

}
 