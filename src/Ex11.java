import java.util.Scanner;
public class Ex11 {

		public static void main(String[] args) {
			      Scanner entrada = new Scanner(System.in);
			      
			      System.out.print("Informe a altura (em metros): ");
			        double altura = entrada.nextDouble();

			        double pesoIdeal = (72.7 * altura) - 58;

			        System.out.println("O peso ideal é: " + pesoIdeal + " kg");

			      
			      entrada.close();
		}

}
