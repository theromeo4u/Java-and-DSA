import java.util.*;

public class Factorial {
    public static void CalculateFactorial(int num1) {
        
        if (num1 < 0) {
            System.out.println("Invalid Number");
            return;
        } 
        int fact = 1;
            for (int i = 1; i <= num1; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + num1 + " is: " + fact);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n = sc.nextInt();

        CalculateFactorial(n);
        sc.close();
    }
}
