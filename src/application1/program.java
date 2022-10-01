package application1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities1.ImportProduct;
import entities1.Product;
import entities1.UsedProduct;

public class program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

		List<Product> pr = new ArrayList<>();
		System.out.print("Digite o numero de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Comum, importadoo ou semi novo? (c/i/s) ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (ch == 'c') {
				pr.add(new Product(name, price));

			} else if (ch == 'i') {
				System.out.print("Taxa da alfandega: ");
				double taxa = sc.nextDouble();
				pr.add(new ImportProduct(name, price, taxa));

			} else {
				System.out.print("Data de Fabricação: (DD/MM/YYYY) ");
				Date fabrica = sdf.parse(sc.next());
				pr.add(new UsedProduct(name, price, fabrica));

			}
		}
		System.out.println();
		System.out.println("Etiqueta de Preço!");

		for (Product emp : pr) {
			System.out.println(emp.priceTag());
		}
		sc.close();
	}

}
