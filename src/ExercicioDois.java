import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//variaveis
		float raioCirculo, areaCirculo, pi;
		pi = 3.14159F;

		//Entrada de Dados
		System.out.println("Digite o raio do circulo: ");
		raioCirculo = sc.nextFloat();

		//Calculo
		areaCirculo = (float) (pi * Math.pow(raioCirculo, 2));

		//Output
		System.out.printf("A = %.4f", areaCirculo);
		sc.close();
	}
}