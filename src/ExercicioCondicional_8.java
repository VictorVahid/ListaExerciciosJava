import java.util.Scanner;

public class ExercicioCondicional_8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double Salario, Imposto;

		System.out.println("Digite seu salário: ");
		Salario = sc.nextDouble();

		if (Salario <= 2000) {
			Imposto = 0.00;
		} else if (Salario <= 3000) {
			Imposto = (Salario - 2000) * 0.08;
		} else if (Salario <= 4500) {
			Imposto = (Salario - 3000) * 0.18 + 1000 * 0.08;
		} else {
			Imposto = (Salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if (Imposto == 0.00) {
			System.out.println("Insento");
		} else {
			System.out.printf("O imposto à ser pago é: R$%.2f", Imposto);
		}
		sc.close();
	}
}
