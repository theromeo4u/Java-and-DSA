import java.util.*;
public class SumOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of integer is : "+SumofDigit(n));
        sc.close();
    }

    static int  SumofDigit(int n){
        int sum=0;
        while (n != 0) {
            sum += n%10;
            n /= 10;
            
        }
        return sum;
    }
}
