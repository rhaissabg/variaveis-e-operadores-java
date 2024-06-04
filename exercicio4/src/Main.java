import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Número 1: ");
		n1 = sc.nextFloat();
		System.out.println("Número 2: ");
		n2 = sc.nextFloat();
		System.out.println("Número 3: ");
		n3 = sc.nextFloat();
		System.out.println("Número 4: ");
		n4 = sc.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("Diferença: %.1f%n", diferenca);
		
		sc.close();
		
	}
	
}
