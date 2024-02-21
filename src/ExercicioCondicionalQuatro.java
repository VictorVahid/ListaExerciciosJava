import java.util.Scanner;

public class ExercicioCondicionalQuatro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int HoraInicial, HoraFinal, Duracao;

		System.out.println("Digite a Hora Inicial da partida: ");
		HoraInicial = sc.nextInt();
		System.out.println("Digite a Hora Final da partida: ");
		HoraFinal = sc.nextInt();


		if (HoraInicial < HoraFinal) {
			Duracao = HoraFinal - HoraInicial;
		} else {
			Duracao = 24 - HoraInicial + HoraFinal;
		}
		System.out.println("A partida durou " + Duracao + " HORA(S)");


		sc.close();
	}
}
