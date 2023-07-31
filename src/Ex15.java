import java.util.Scanner;
public class Ex15 {
	
		public static void main(String[] args) {
					
			Scanner entrada = new Scanner(System.in);
					
					System.out.print("Qual a Area em metros quadrados a ser pintada?");
					float area= entrada.nextFloat();
					float latas = (area/3)/18;
					double custo = (latas*80);
					System.out.println("O Valor de latas a serem compradas ?"+ latas);
					System.out.println("O Custo das latas ?"+ custo);
					entrada.close();
				}

		}
