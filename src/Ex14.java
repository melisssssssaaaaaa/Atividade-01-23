import java.util.Scanner;
public class Ex14 {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Quanto voc� ganha por hora?");
			float ganha = entrada.nextFloat();
			
			System.out.print("Quantas horas voc� trabalha por m�s?");
			float horatrabalha = entrada.nextFloat();
			
			double salariobruto = (horatrabalha*ganha);
			double inss = salariobruto*0.08;
			double sindicato = salariobruto*0.05;
			double ir = salariobruto*0.11;
			double salarioliquido = salariobruto - inss - sindicato - ir;
			
			System.out.println("Salario Bruto = "+ salariobruto);
			System.out.println("imposto de renda =" + ir);
			System.out.println("inss =" + inss);
			System.out.println("valor do sindicato =" + sindicato);
			System.out.println("salario liquido" +salarioliquido);
			entrada.close();
		}

	}
