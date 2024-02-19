import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Exercicio 1
		int numeroUm = 0, numeroDois = 0;
		System.out.println("Digite um número: ");
		numeroUm = scanner.nextInt();
		System.out.println("Digite o segundo número: ");
		numeroDois = scanner.nextInt();

		int soma = numeroUm + numeroDois;

		System.out.printf("A soma é : %d", soma);
		scanner.close();
	}
}