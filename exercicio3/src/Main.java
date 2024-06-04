import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horaExtra, descontos, salarioLiquido;
		
		System.out.println("Salário bruto: ");
		salarioBruto = sc.nextFloat();
		System.out.println("Adicional noturno: ");
		adicionalNoturno = sc.nextFloat();
		System.out.println("Hora extra: ");
		horaExtra = sc.nextFloat();
		System.out.println("Descontos: ");
		descontos = sc.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horaExtra * 5) - descontos;
		
		System.out.printf("Salário líquido: %.2f%n", salarioLiquido);
		
		sc.close();

	}

}
