package Question2;

import java.util.*;


public class Main {
	
	public static void primeFactors(int n) {
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
	}
	
	
	static void wrongNumbers() {
//		System.out.println("Enter valid number Between 2 to 100");
		
		main(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Supplied any Number Between 2 and 100");
		
		int n = sc.nextInt();
		
		if(n>1 && n <= 100) {
			
			primeFactors(n);
		}else {
			wrongNumbers();
		}

	}

}
