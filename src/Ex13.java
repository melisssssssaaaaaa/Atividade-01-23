import java.util.Scanner;
public class Ex13 {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Informe o peso de peixes (em quilos): ");
	        double peso = sc.nextDouble();

	        double pesoExcedente = peso - 50; 
	        double multa = 0.0;

	        if (pesoExcedente > 0) {
	            multa = pesoExcedente * 4.0;
	        }

	        System.out.println("Excesso de peso: " + (pesoExcedente > 0 ? pesoExcedente : "ZERO OU NEGATIVO"));
	        System.out.println("Multa a pagar: " + (multa > 0 ? "R$ " + multa : "ZERO OU NEGATIVO"));

	        sc.close();
	    }
	}
