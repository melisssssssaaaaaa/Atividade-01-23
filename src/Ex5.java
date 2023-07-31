import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
					
		System.out.println("Digite uma medida em metros: ");
		float metros = entrada.nextFloat();

	    System.out.println("Essa medida em centimetro �: "+( metros*100) + "cm");
		entrada.close();
	}

}
