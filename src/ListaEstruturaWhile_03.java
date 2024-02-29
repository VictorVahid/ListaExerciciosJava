import java.util.Scanner;

public class ListaEstruturaWhile_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;


		System.out.println("Digite o código conrrespondente: ");
		System.out.println("Alcool = 1");
		System.out.println("Gasolina = 2");
		System.out.println("Diesel = 3");
		System.out.println("Fim = 4");

		int tipo = sc.nextInt();


		if (tipo != 1 && tipo != 2 && tipo != 3 && tipo != 4) {
			System.out.println("Digite a opcão valida:");
			System.out.println("Alcool = 1");
			System.out.println("Gasolina = 2");
			System.out.println("Diesel = 3");
			System.out.println("Fim = 4");
		}

		while (tipo != 4) {
			if (tipo == 1) {
				Alcool += 1;
			} else if (tipo == 2) {
				Gasolina += 1;
			} else if (tipo == 3) {
				Diesel += 1;
			}
			tipo = sc.nextInt();
		}

		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + Alcool);
		System.out.println("Gasolina: " + Gasolina);
		System.out.println("Diesel: " + Diesel);
		sc.close();
	}
}
