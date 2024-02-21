import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Variaveis
		int numeroUm = 0, numeroDois = 0;


		//Entrada de Dados
		System.out.println("Digite um número: ");
		numeroUm = scanner.nextInt();
		System.out.println("Digite o segundo número: ");
		numeroDois = scanner.nextInt();
		//Calculos
		int soma = numeroUm + numeroDois;
		//Saida de Dados
		System.out.printf("A soma é : %d", soma);
		scanner.close();
	}
}