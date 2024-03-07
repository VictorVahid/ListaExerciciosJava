import java.util.Scanner;

public class ExercicioEstruturaFor_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE QUANTAS CONTAS SERÃO FEITAS: ");
		int n = sc.nextInt();
		double resultado = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o primeiro número: ");
			int a = sc.nextInt();
			System.out.println("Digite o segundo número: ");
			int b = sc.nextInt();

			if (b == 0) {
				System.out.println("divisao impossivel");
			} else {
				resultado = ((double) a / b);
				System.out.println("Resultado: " + resultado);
			}
		}


		sc.close();
	}
}
