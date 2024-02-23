package calcul;

public class calculatricee {

	    public double addition(double a, double b) {
	        return a + b;
	    }

	    public double soustraction(double a, double b) {
	        return a - b;
	    }

	    public double multiplication(double a, double b) {
	        return a * b;
	    }

	    public double division(double a, double b) {
	        if (b == 0) {
	            throw new IllegalArgumentException("Division par zéro n'est pas permise.");
	        }
	        return a / b;
	    }
	}


