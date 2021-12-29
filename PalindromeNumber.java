package week1.day2.assignment1;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=454;
		int temp=n,sum=0,r;
		while(n > 0) {
			r = n % 10;
			sum = (sum*10)+r;
			n= n/10;
			}
		if(temp==sum) {
			System.out.println("It is a Palindrome Number");
		}
		else {
			System.out.println("It's not a Palindrome ");
		}

	}

}
