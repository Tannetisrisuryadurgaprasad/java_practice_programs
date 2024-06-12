package day7;
import java.util.Scanner;

public class FUN4 {
	public int add(int a,int b) {
		int c=a+b;
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		System.out.println("Enter two numbers: ");
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		
		FUN4 k=new FUN4();
		int d=k.add(x,y);
		System.out.println("Addition is : "+d);

	}

}
