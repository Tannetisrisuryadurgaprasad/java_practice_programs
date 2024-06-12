package day7;
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the caliculator program");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Emter 1st num: ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd num: ");
		int b=sc.nextInt();
		System.out.print("ENter the operator: ");
		char c=sc.next().charAt(0);
		if(c=='+') {
			System.out.print("Addition: "+(a+b));
		} else if(c=='-') {
			System.out.print("Subtraction: " +(a-b));
		} else if(c=='*') {
			System.out.print("Multiplication: "+(a*b));
			
		}else if(c=='/') {
			System.out.print("Division: "+(a/b));
		}else if (c=='%') {
			System.out.print("Modulus: "+(a%b));
			
		}else {
			System.out.println("Enter + or - or * or / or % only");
		}
		
	}

}
