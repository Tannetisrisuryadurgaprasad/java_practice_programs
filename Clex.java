
import java.util.Scanner;
public class Clex {
	
	Clex(int y){
		System.out.println("you are eligible for vote");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter your birth year: ");
		
		Scanner sc = new Scanner(System.in);
		int v=sc.nextInt();
		int k=2024-v;
		if(k>=18) {
			Clex jn=new Clex(v);
			
		}
		else {
			System.out.println("You are under 18, so you are not-eligible");
		}
		
		
		
		

	}

}
