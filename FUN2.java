//package day7;
import java.util.Scanner;
public class FUN2 {
	public void add(int a,int b) {
		int c=a+b;
		
		System.out.println("Addition: "+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		FUN2 k=new FUN2();
		k.add(x, y);

	}

}
