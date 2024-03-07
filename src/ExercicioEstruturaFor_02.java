import java.util.Scanner;

public class ExercicioEstruturaFor_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Out = 0;
		int In = 0;

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				In += 1;
			} else Out += 1;
		}
		System.out.println("IN: " + In);
		System.out.println("Out: " + Out);
		sc.close();
	}
}
