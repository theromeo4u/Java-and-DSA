
public class sumOfDigit {
    int sum=0;
	public int sumOfDigits(int number){
	    for (sum = 0; number > 0; sum = sum + number % 10, number = number / 10);
	    return sum;
	}
}

class Tester {

	public static void main(String args[]) {
	    int num=7812089;
		sumOfDigit val = new sumOfDigit();
		System.out.println(val.sumOfDigits(num));

	}
}
