package day7;

import java.util.Scanner;

public class FUN1 {
	public void add()
	{
		int a,b;
		System.out.println("Enter 2 numbers: ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition : " +(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FUN1 h=new FUN1();
		h.add();

	}

}
