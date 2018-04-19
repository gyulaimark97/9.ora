package polynomial;

import java.util.Scanner;


public class Test {
	
	public static void polynomialTable(LinearPolynomial polynomial) {
		System.out.println("0     0,1     0,2     0,3     0,4     0,5     0,6     0,7     0,8     0,9     1");
		for(double i=0;i<=1;i+=0.1) {
			System.out.print(polynomial.getY(i)+"     ");
		}
		System.out.println("\n");
	}
		
	public static void main(String[] args) {
			
		Scanner scan= new Scanner(System.in);
		LinearPolynomial [] polynomials= new LinearPolynomial[5];
		
		
		for(int i =0;i<5;i++) {
			System.out.println("Give the factors of the Polynomial");
			polynomials[i]=new LinearPolynomial(scan.nextDouble(),scan.nextDouble());
		}
		
		for(int i =0;i<5;i++)
			polynomialTable(polynomials[i]);
		
		scan.close();
	}
}
