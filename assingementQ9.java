package helloworld;
import java.util.Scanner;
public class assingementQ9 {

	public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);

        System.out.print ("Enter a String:");
        str = scan.next();
        System.out.print("Reversed String is ");
       for(int i = str.length() - 1; i >= 0; --i)
         {
             System.out.print(str.charAt(i)); 
         }
    }

}

	


