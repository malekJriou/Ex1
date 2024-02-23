package calcul;
import java.util.Scanner;
public class test {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        calculatricee calculatrice = new calculatricee();

	        System.out.print("entrez le premier nombre: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("entrez l'opération (+, -, *, /): ");
	        char operation = scanner.next().charAt(0);

	        System.out.print("entrez le deuxième nombre: ");
	        double num2 = scanner.nextDouble();

	        try {
	            double resultat = 0;
	            switch (operation) {
	                case '+':
	                    resultat = calculatrice.addition(num1, num2);
	                    break;
	                case '-':
	                    resultat = calculatrice.soustraction(num1, num2);
	                    break;
	                case '*':
	                    resultat = calculatrice.multiplication(num1, num2);
	                    break;
	                case '/':
	                    resultat = calculatrice.division(num1, num2);
	                    break;
	                default:
	                    System.out.println("Opération inconnue.");
	                    return;
	            }
	            System.out.println("Résultat: " + resultat);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Erreur: " + e.getMessage());
	        }
	    }
	}
