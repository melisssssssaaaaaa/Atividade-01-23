import java.util.Scanner;
public class Ex8 {
	
	public class GanhaHoras {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Informe quanto voc� ganha por hora?");
			Float ganha = entrada.nextFloat();
			
			System.out.print("Informe quantas horas voc� trabalha?");
			Float horas = entrada.nextFloat();
			
		     System.out.println("O valor do sal�rio no mas � de " + ganha + horas);
		     
		      entrada.close();
	}

		}

}
