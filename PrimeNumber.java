package logics;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	
	System.out.println("Enter the number :");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int count=0;
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			count=0;
			break;
		}
		else {
			count=1;
		}
	}
	
	if(count==1) {
		System.out.println("It is a prime number");
	}
	else {
		System.out.println("Not a prime number");
	} 
	
}
}
