import java.util.Scanner;

public class ExercicioCondicional_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float Valor1;

		System.out.println("Digite um número: ");
		Valor1 = sc.nextFloat();

		if ((Valor1 >= 0) && (Valor1 <= 25.00)) {
			System.out.println("Este valor se encontra no intervalo entre [0,25]");
		} else if ((Valor1 >= 25.01) && (Valor1 <= 50.00)) {
			System.out.println("Este valor se encontra no intervalo entre [25,50]");
		} else if ((Valor1 >= 50.01) && (Valor1 <= 75.00)) {
			System.out.println("Este valor se encontra no intervalo entre [50,75]");
		} else if ((Valor1 >= 75.01) && (Valor1 <= 100)) {
			System.out.println("Este valor se encontra no intervalo entre [75,100]");
		}

		sc.close();
	}
}
