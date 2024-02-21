import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Variaveis
		int NumeroA, NumeroB, NumeroC, NumeroD;
		int Resultado;

		//Entrada
		System.out.println("Digite o primeiro número: ");
		NumeroA = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		NumeroB = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		NumeroC = sc.nextInt();
		System.out.println("Digite o quarto número: ");
		NumeroD = sc.nextInt();
		//Calculos


		Resultado = (NumeroA * NumeroB) - (NumeroC * NumeroD);

		//Saida
		System.out.printf("A diferença é : %d", Resultado);

		sc.close();


	}
}
