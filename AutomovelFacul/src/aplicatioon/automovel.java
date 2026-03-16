// FELIPE GUEDES
// TRABALHO DA FACULDADE, VOLTADO A CADASTRO DE UM VEÍCULO COM INFORMAÇÕES BÁSICAS.
package aplicatioon;

import java.util.Locale;
import java.util.Scanner;

import entities.auto1;

public class automovel{

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		auto1 veiculo = new auto1();

		System.out.println("1 - Automóveis");
		System.out.println("2 - Moto");
		System.out.print("Escolha o tipo: ");
		veiculo.tipo = sc.nextInt();
		sc.nextLine();

		System.out.print("Modelo: ");
		veiculo.modelo = sc.nextLine();

		System.out.print("Cor: ");
		veiculo.cor = sc.nextLine();

		System.out.print("Massa: ");
		veiculo.massa = sc.nextDouble();

		if (veiculo.tipo == 1) {
			System.out.print("Quantidade de portas: ");
			veiculo.portas = sc.nextInt();
		}

		if (veiculo.tipo == 2) {
			System.out.print("Quantidade de rodas: ");
			veiculo.rodas = sc.nextInt();
		}

		System.out.println();
		System.out.println("Dados do veículo:");
		System.out.println(veiculo);

		sc.close();
	}
}