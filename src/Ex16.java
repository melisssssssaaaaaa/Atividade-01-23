import java.util.Scanner;
public class Ex16 {

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Informe o tamanho da área a ser pintada (em metros quadrados): ");
	        double areaPintada = entrada.nextDouble();

	        double quantidadeTinta = areaPintada / 6.0;

	        int latas18Litros = (int) Math.ceil(quantidadeTinta / 18.0); 
	        int galoes3_6Litros = (int) Math.ceil(quantidadeTinta / 3.6);

	        double precoLata18Litros = latas18Litros * 80.0;
	        double precoGalao3_6Litros = galoes3_6Litros * 25.0;

	        System.out.println("Quantidade de tinta necessária: " + quantidadeTinta + " litros");

	        System.out.println("Comprando apenas latas de 18 litros:");
	        System.out.println("Quantidade de latas de 18 litros: " + latas18Litros);
	        System.out.println("Preço total: R$ " + precoLata18Litros);

	        System.out.println("Comprando apenas galões de 3,6 litros:");
	        System.out.println("Quantidade de galões de 3,6 litros: " + galoes3_6Litros);
	        System.out.println("Preço total: R$ " + precoGalao3_6Litros);

	        entrada.close();
	    }
	}
