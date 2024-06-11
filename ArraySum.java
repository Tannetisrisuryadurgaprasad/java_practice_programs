package day7;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the n value: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		
		
		
		int c=0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			c+=a[i];
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		
		System.out.println("Sum: " + c);
		
		

	}

}
