import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Application {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Número de contribuintes: ");
		int numeroFuncs = sc.nextInt();

		List<Pessoa> list = new ArrayList<Pessoa>();

		for (int i = 0; i < numeroFuncs; i++) {
			System.out.printf("Tax payer #%d\n", i + 1);
			System.out.print("Individual or company(i/c): ");
			char iORc = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			if (iORc == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				Pessoa pessoa = new PessoaFisica(name, annualIncome, healthExpenditures);
				list.add(pessoa);
			} else {
				System.out.print("Number of employees: ");
				int numOfEmployees = sc.nextInt();
				Pessoa pessoa = new PessoaJuridica(name, annualIncome, numOfEmployees);
				list.add(pessoa);
			}
		}

		System.out.println("TAXES PAID");
		for(Pessoa pessoa: list) {
			System.out.printf("%s: $ %.2f\n", pessoa.getNome(), pessoa.impostoAnual());
		}
		
		System.out.print("TOTAL TAXES: $ ");
		double total = 0.0;
		for(Pessoa pessoa: list) {
			total += pessoa.impostoAnual();
		}
		System.out.println(String.format("%.2f", total));
		
		sc.close();
	}
}
