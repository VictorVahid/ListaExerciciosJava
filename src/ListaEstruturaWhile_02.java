import java.util.Scanner;

public class ListaEstruturaWhile_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int IN = 0;
		int OUT = 0;
		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				IN += 1;
			} else {
				OUT += 1;
			}
		}
		System.out.println("IN:" + IN);
		System.out.println("OUT: " + OUT);

		sc.close();
	}

}
