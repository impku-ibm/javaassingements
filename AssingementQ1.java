package helloworld;
import java.util.Scanner;
public class AssingementQ1 {

	public static void main(String[] args) {
		long sum=0;
		long rem,temp;
		long sum1=0;
		System.out.println("Enter the number: " );
		Scanner sc = new Scanner(System.in);
        long num1 =sc.nextLong();
        System.out.println("Entered number is : " +num1);
        temp=num1;
        while(num1>0) {
        	rem = num1%10;
        	sum=(sum*10)+rem;
        	num1 /=10;
        }
        if(temp==sum) {
        	
        	while(num1>0) {
        		rem=num1%10;
        		if(rem%2==0) {
        		sum1+=rem;}
        		num1 /= num1;
        	}
        	if(sum1>25) {
        		System.out.println(temp+ " is pellindrome and sum of even number is greater than 25");
        		
        	}
        	else {
        		System.out.println(temp+ " is pellindrome and sum of even number is less than 25");
        	}
        }
        else {
        	System.out.println("The number is not a pellindrome");
        }
	}

}
