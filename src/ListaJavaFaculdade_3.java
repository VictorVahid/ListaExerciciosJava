import java.util.Scanner;

public class ListaJavaFaculdade_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double N1, N2, Media;

		System.out.println("Digite o Primero número: ");
		N1 = sc.nextDouble();
		System.out.println("Digite o Segundo número: ");
		N2 = sc.nextDouble();

		Media = (N1 + N2) / 2;

		System.out.println("A media é: "+ Media);


		sc.close();

	}

}
