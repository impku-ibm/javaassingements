package helloworld;
import java.util.Scanner;
public class assingementQ4 {

	public static void main(String[] args) {
		int i;
		int j;
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(i=0;i<=size;i++) {
			for(j=1;j<i+1;j++) {
				System.out.print(i);
			}
		}

	}

}
