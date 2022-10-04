package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.circulo;
import entities.corpo;
import entities.retangulo;
import entities.enums.color;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<corpo> corpo = new ArrayList<>();

		System.out.print("Digite quantidade de formas: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Forma #" + i);
			System.out.print("Retangulo ou Circulo: (r/c) ");
			char ch = sc.next().charAt(0);
			System.out.print("Cor: (BLACK/ GREEN /RED) ");
			color cor = color.valueOf(sc.next());

			if (ch == 'c') {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				corpo.add(new circulo(cor, raio));

			} else {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				corpo.add(new retangulo(cor, largura, altura));
			}
		}
		System.out.println();
		System.out.println("AREAS DAS FORMAS:");
		for (corpo emp : corpo) {
			System.out.println(emp.area());
		}
		sc.close();
	}

}
