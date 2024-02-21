import java.util.Scanner;

public class ExercicioCondicionalDois {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada;
		System.out.println("Digite um número: ");
		entrada = sc.nextInt();

		if (entrada % 2 == 0) {
			System.out.println("Esse número é par!");
		} else
			System.out.println("Esse número é ímpar!");
		sc.close();
	}
}
