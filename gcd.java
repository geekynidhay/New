package test;
import java.util.Scanner;

public class Main {
	public static void main (String[] args){
	    Scanner scanner = new Scanner (System.in);
	    
	    System.out.println ("Enter Number 1");
	    
	    int num1 = scanner.nextInt();
	    
	    System.out.println ("Enter Number 2");
	     int num2 = scanner.nextInt();
	     
	     int ans = GCD(num1, num2);
	     
	     System.out.println ("GCD Num 1 : " + num1 + " GCD Num 2 : " + num2 + " Answer is " + ans );
	}

	private static int GCD(int num1, int num2) {
		int ans = 0;
        for (int i = 1; i <=num1; i++){
            if (num1%i==0 && num2%i == 0){
                ans = i;
            }
        }
        return ans;
	}
}
