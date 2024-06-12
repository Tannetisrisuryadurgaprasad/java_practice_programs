package day7;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				c+=1;
			}
		}
		if(c==1) {
			System.out.println(n + " is prime number");
		}else {
			System.out.println(n+" is not a prime number");
		}

	}

}
