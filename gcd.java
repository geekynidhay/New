import java.util.Scanner;


public class GCD {
    public static int findingGCD(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    
    System.out.println ("Enter Number 1");
    
    int num1 = scanner.nextInt();
    
    System.out.println ("Enter Number 2");
     int num2 = scanner.nextInt();
     
     int ans = findingGCD(num1, num2);
     
     System.out.println ("GCD Num 1 : " + num1 + " GCD Num 2 : " + num2 + " Answer is " + ans );
}
}
