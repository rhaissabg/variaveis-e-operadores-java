import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float salario, abono, total;
		
		System.out.println("Digite o salário: ");
		salario = sc.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = sc.nextFloat();
		
		total = salario + abono;
		
		System.out.printf("Novo salário: %.2f%n", total);
		
		sc.close();

	}

}
