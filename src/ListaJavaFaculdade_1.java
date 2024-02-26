import java.util.Scanner;

public class ListaJavaFaculdade_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Entrada, Antecessor, Sucessor;

		System.out.println("Digite um número: ");
		Entrada = sc.nextInt();

		Antecessor = (Entrada - 1);
		Sucessor = (Entrada + 1);

		System.out.printf("O antecessor  de %d é : %d %ne o sucessor é : %d ", Entrada, Antecessor, Sucessor);

		sc.close();
	}
}
