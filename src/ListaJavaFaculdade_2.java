import java.util.Scanner;

public class ListaJavaFaculdade_2 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		float N1,N2,resultado;
		System.out.println("Digite o primeiro número: ");
		N1 = sc.nextFloat();
		System.out.println("Digite o segundo número: ");
		N2 = sc.nextFloat();

		resultado = (N1+N2);

		System.out.println("A some é : " + resultado);
		sc.close();
	}
}
