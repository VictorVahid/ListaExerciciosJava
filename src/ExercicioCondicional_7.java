import java.util.Scanner;

public class ExercicioCondicional_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float ValorX, ValorY;

		System.out.println("Digite o valor de X: ");
		ValorX = sc.nextFloat();
		System.out.println("Digite o valor de Y: ");
		ValorY = sc.nextFloat();
		if (ValorX == 0 && ValorY == 0) {
			System.out.println("Origem");
		} else if (ValorX == 0) {
			System.out.println("Está sobre eixo X");
		} else if (ValorY == 0) {
			System.out.println("Está sobre eixo Y");
		} else if (ValorX >= 0.1 && ValorY >= 0.1) {
			System.out.println("Q1");
		} else if (ValorX <= -0.1 && ValorY >= 0.1) {
			System.out.println("Q2");
		} else if (ValorX <= -0.1 && ValorY <= -0.1) {
			System.out.println("Q3");
		} else if (ValorX >= 0.1 && ValorY <= -0.1) {
			System.out.println("Q4");
		}
		sc.close();
	}
}
