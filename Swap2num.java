import java.util.*;

class Swap{
    public static int Swap2num(int a,int b){
        System.out.println("Before Swapping = "+a+" "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping = "+a+" "+b);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Swap2num(a,b));
        sc.close(); }
}
