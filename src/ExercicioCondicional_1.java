import java.util.Scanner;

public class ExercicioCondicional_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroTeste;

		System.out.println("Digite um número: ");
		numeroTeste = sc.nextInt();

		if (numeroTeste == 0) {
			System.out.println("Esse número é Neutro!");
		} else if (numeroTeste >= 1) {
			System.out.println("Esse número é Positivo!");
		} else {
			System.out.println("Esse número é negativo ");
		}
		sc.close();
	}
}
