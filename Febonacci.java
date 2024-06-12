package day7;
import java.util.Scanner;
public class Febonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[50];
		
		int i=0,c=0,k=1,z=0;
		a[0]=0;
		
		while(c!=n) {
			c=i+k;
			
			a[z]=c;
			if(c>n) {
				break;
			}
			i=k;
			k=c;
			z+=1;
			
			
			
		}
		for(int q=0;q<z;q++) {
			System.out.print(a[q] +"   ");
		}

	}

}
