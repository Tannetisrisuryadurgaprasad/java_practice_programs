package day7;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[][]=new int[50][50];
		int arr2[][]=new int[50][50];
		int res[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		int c=0;
		
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
				arr1[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<2;i++) {
					
					for(int j=0;j<2;j++) {
						arr2[i][j]=sc.nextInt();
						
					}
				}
		for(int i=0;i<2;i++) {
					
					for(int j=0;j<2;j++) {
						res[i][j]=arr1[i][j]+arr2[i][j];
						
					}
				}
		
			for(int i=0;i<2;i++) {
						
						for(int j=0;j<2;j++) {
							//System.out.print(arr[i][j]+"\t");
							System.out.print(res[i][j]+"\t");
							
						}
						System.out.println();
					}

	}

}
