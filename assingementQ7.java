package helloworld;
import java.util.Scanner;
public class assingementQ7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int  number = input.nextInt();
		int i=0;
		int l=Long.toString(number).length();
		int[] array= new int[l];
		 int rem;
		 int sum=0;
		while(number>0) {
			rem=number%10;
			array [i]= rem;
			if(rem%2==0) {
				sum+=rem;
			}
			 number/=10;
			 i++;	 
		}
	//	for(int j=0;j<array.length;j++) {
     // System.out.print(array[j]);}
		for(int k=0;k<l;k++) {
			for(int m=k+1;m<l;m++) {
				if(array[k]<array[m]) {
					int temp =array[k];
					array[k]=array[m];
					array[m]=temp;
				}
			}
		}
		System.out.println("Descending Order");
		for(int k=0;k<l-1;k++) {
			System.out.print(array[k]);
		}
		System.out.println(array[l-1]);
		
		System.out.println("Sum of even digit is " + sum);
		if(sum>15) {
		System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		
	}}

