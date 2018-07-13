package helloworld;
import java.util.Scanner;
public class assingementQ2 {

	public static void main(String[] args) {
	   
	    System.out.println("Enter the number:-");
	    Scanner sc = new Scanner(System.in);
	    int num1 =sc.nextInt();
	    if((num1%2!=0) && num1>20 && num1<30) {
	    	System.out.println("Tom");
	    }
	    else if((num1%2==0) && num1>20 && num1<30){
	    	System.out.println("Jerry");
	    }
	    else {
	    	return;
	    }
	}

}
