package application2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities2.fisica;
import entities2.imposto;
import entities2.juridica;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<imposto> tax = new ArrayList<>();

		System.out.print("Digite os usuarios: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Pessoa fisica ou juridica (f/j)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();

			if (ch == 'f') {
				System.out.print("Valor gasto com saude: ");
				double gastoSaude = sc.nextDouble();
				tax.add(new fisica(name, rendaAnual, gastoSaude));
			} else {
				System.out.print("Quantos funcionarios? ");
				int numeroFuncionario = sc.nextInt();
				tax.add(new juridica(name, rendaAnual, numeroFuncionario));
			}
		}

		System.out.println();
		System.out.println("Imposto Recolhido: ");

		for (imposto emp : tax) {
			System.out.println(emp.getNome() + " $ " + String.format("%.2f", emp.roubo()));
		}
		System.out.println();
		double soma = 0;

		for (imposto emp : tax) {
			soma += emp.roubo();
		}

		System.out.println("Total de imposto recolhido: $ " + String.format("%.2f", soma));
		sc.close();

	}

}
