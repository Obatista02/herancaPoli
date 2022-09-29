package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Tercerizado;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> funci = new ArrayList<>();

		System.out.println("Digite o numero de Funcionarios: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os dados do " + i + "º funcionario ");
			System.out.print("Tercerizado: (S/N) ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.print("Horas: ");
			int hours = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();

			if (ch == 's') {
				System.out.println("Cobrança adicional: ");
				double adicional = sc.nextDouble();

				funci.add(new Tercerizado(name, hours, valuePerHour, adicional));
			} else {
				funci.add(new Employee(name, hours, valuePerHour));
			}
			System.out.println();
			for (Employee emp : funci) {
				System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.pagamento()));
			}
		}

		sc.close();
	}

}
