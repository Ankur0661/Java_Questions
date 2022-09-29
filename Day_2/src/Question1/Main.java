package Question1;

import java.util.*;

public class Main {
	
	
	public static void sumOfPositiveNumber(int n) {
		int sum=0;   //  Declare the Variable Sum
		
		sum = (n*(n+1))/2;  //  first N natural numbers is given by the formula [N * (N + 1)] / 2  
		
		System.out.println(sum);  // print the result
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // Take Scanner class for taking input from the User.
		
		System.out.println("Enter Positive Number");
		
		int n = sc.nextInt();  // Declare the Variable n
		
		sumOfPositiveNumber(n);  // call the above function
		

	}

}
