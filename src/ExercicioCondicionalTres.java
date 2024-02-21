import java.util.Scanner;

public class ExercicioCondicionalTres {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int PrimeiraEntrada, SegundaEntrada;

		System.out.println("Digite um número: ");
		PrimeiraEntrada = sc.nextInt();
		System.out.println("Digite outro número: ");
		SegundaEntrada = sc.nextInt();


		if (PrimeiraEntrada % SegundaEntrada == 0) {
			System.out.println("São Multiplos!");
		} else
			System.out.println("Não são Multiplos!");

		sc.close();

	}
}
