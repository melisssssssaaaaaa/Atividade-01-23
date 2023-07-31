import java.util.Scanner;
public class Ex3 {
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
					
	System.out.print("Digite um número:");
	float n1 = entrada.nextFloat();
					
	System.out.print("Digite outro número:");
	float n2 = entrada.nextFloat();
	System.out.println("A soma é:"+ (n1+n2));
					
	entrada.close();

		}

	}
