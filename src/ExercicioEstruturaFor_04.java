import java.util.Scanner;

public class ExercicioEstruturaFor_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			float a = sc.nextFloat();
			float b = sc.nextFloat();

			if (b == 0) {
				System.out.println("Divisão impossivel");
			} else {
				float resultado = a / b;
				System.out.println(resultado);
			}
		}


		sc.close();
	}
}
