import java.util.Scanner;

public class ExercicioCondicional_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Pedido, Quantidade;
		double TotalPagar = 0;

		System.out.println("Digite 1 para Cachorro Quente: ");
		System.out.println("Digite 2 para X-Salada:");
		System.out.println("Digite 3 para X-Bacon:");
		System.out.println("Digite 4 para Torrada Simples:");
		System.out.println("Digite 5 para Refrigerante:");

		Pedido = sc.nextInt();

		if (Pedido == 1) {
			System.out.println("Quantos Cachorros-Quentes serão: ");
			Quantidade = sc.nextInt();
			TotalPagar = Quantidade * 4;
		} else if (Pedido == 2) {
			System.out.println("Quantos X-Saladas serão: ");
			Quantidade = sc.nextInt();
			TotalPagar = Quantidade * 4.50;
		} else if (Pedido == 3) {
			System.out.println("Quantos X-Bacons serão: ");
			Quantidade = sc.nextInt();
			TotalPagar = Quantidade * 5;
		} else if (Pedido == 4) {
			System.out.println("Quantas Torradas serão: ");
			Quantidade = sc.nextInt();
			TotalPagar = Quantidade * 2;
		} else {
			System.out.println("Quantos Refrigerantes serão: ");
			Quantidade = sc.nextInt();
			TotalPagar = Quantidade * 1.50;
		}
		System.out.printf("Total: R$ %.2f", TotalPagar);

		sc.close();
	}
}

