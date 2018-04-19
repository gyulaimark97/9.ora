package polynomial;
import math.Polynomial;

public class LinearPolynomial implements Polynomial {
	
	private double a;
	private double b;
	
	public LinearPolynomial (double a, double b) {
		this.a=a;
		this.b=b;
	}

	public double getY(double x) {
		return a*x+b;
	}
	
	public int getPolynomPhase() {
		return 1;
	}
	
	public String toString() {
		return "y="+a+"*x+"+b;
	}
	
}
