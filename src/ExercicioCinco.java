import java.util.Scanner;

public class ExercicioCinco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Variaveis
		int Id_1, Quantidade_peca1, Id_2, Quantidade_peca2;
		float Valor_peca1, Valor_peca2, Total;


		//Entrada
		System.out.println("Digite o código da peça: ");
		Id_1 = sc.nextInt();
		System.out.println("Quantas peças?: ");
		Quantidade_peca1 = sc.nextInt();
		System.out.println("Valor da peça (Unitário): ");
		Valor_peca1 = sc.nextFloat();
		System.out.println("Digite o código da peça: ");
		Id_2 = sc.nextInt();
		System.out.println("Quantas peças?: ");
		Quantidade_peca2 = sc.nextInt();
		System.out.println("Valor da peça (Unitário): ");
		Valor_peca2 = sc.nextFloat();

		//Calculos
		Total = (Quantidade_peca1 * Valor_peca1) + (Quantidade_peca2 * Valor_peca2);

		//Saida de Dados
		System.out.printf("Valor à pagar: R$ %.2f", Total);
		sc.close();
	}
}
