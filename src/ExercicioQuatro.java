import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Variaveis
		int id;
		float horasTrabalhadas, SalarioHora, SalarioFinal;

		//Entrada de Dados
		System.out.println("Digite o seu número de Identificação (ID): ");
		id = sc.nextInt();
		System.out.println("Digite o número de horas que você trabalhou: ");
		horasTrabalhadas = sc.nextFloat();
		System.out.println("Digite o Valor Hora: ");
		SalarioHora = sc.nextFloat();

		//Calculos
		SalarioFinal = (horasTrabalhadas * SalarioHora);


		//Saida de Dados
		System.out.printf("Number: %d %n", id);
		System.out.printf("Salary: U$ %.2f", SalarioFinal);

		sc.close();

	}
}
