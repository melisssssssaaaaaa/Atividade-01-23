import java.util.Scanner;
public class Ex6 {

			public static void main(String[] args) {
		         Scanner entrada = new Scanner(System.in);
				
				System.out.print("Digite o raio do circulo: ");
				float raio = entrada.nextFloat();
				
				System.out.print("Digite a area da circuferencia: ");
				float area = (float) 3.14 * (raio *2);
				
				System.out.println("A area da circuferencia é de: " + area);
				entrada.close();
			}

		}