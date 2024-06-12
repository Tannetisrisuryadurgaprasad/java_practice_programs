package day7;
import java.util.Scanner;
public class FUN3 {
	
public int add()
{
	System.out.println("Enter two numbers: ");
	Scanner sc=new Scanner(System.in);
	int x,y;
	x=sc.nextInt();
	y=sc.nextInt();
	int c=x+y;
	return c;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FUN3 i=new FUN3();
		int k=i.add();
		System.out.println(k);
		

	}

}
