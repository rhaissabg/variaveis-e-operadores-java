import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Nota 1: ");
		nota1 = sc.nextFloat();
		System.out.println("Nota 2: ");
		nota2 = sc.nextFloat();
		System.out.println("Nota 3:");
		nota3 = sc.nextFloat();
		System.out.println("Nota 4: ");
		nota4 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Média final: %.1f%n", media);
		
		sc.close();

	}

}
