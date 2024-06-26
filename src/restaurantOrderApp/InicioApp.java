package restaurantOrderApp;

import java.util.Scanner;

public class InicioApp {
	public static void main(String[] args) {
		int opcao = 0;
		int ovos = 0, torrada = 0, cafe = 0;
		int bife = 0, batata = 0, vinho = 0, bolo = 0;

		System.out.println("*** Restaurant Order App ^_^ ***");
		System.out.println("Escolha o per�odo de sua refei��o:");
		System.out.println("1 = Manha");
		System.out.println("2 = Noite");
		Scanner input = new Scanner(System.in);
		opcao = input.nextInt();

		while (opcao < 1 || opcao > 2) {
			System.out.println("Por Favor, digite apenas entre 1 ou 2 das op��es mostradas.");
			Scanner input1 = new Scanner(System.in);
			opcao = input1.nextInt();
		}

		// Refei��o da Manh�
		if (opcao == 1) {

			System.out.println("REFEI��O DA MANH�:");
			System.out.println("1 = Entrada, 2 = Acompanhamento, 3 = Bebida e 4 = Sobremesa.\n");
			System.out.println("1 - Ovos");
			System.out.println("2 - Torrada");
			System.out.println("3 - Caf�");
			System.out.println("4 - Nenhuma");
			System.out.println("*ATEN��O: Apenas a bebida pode ser repetida.\n");

			System.out.println("Digite 1 se deseja Ovos e 0 caso n�o:");
			ovos = input.nextInt();

			System.out.println("Digite 1 se deseja Torrada e 0 caso n�o:");
			torrada = input.nextInt();

			System.out.println("Digite a quantidade de Caf� que deseja:");
			cafe = input.nextInt();

			System.out.println("OBS: N�o oferecemos sobremesa no per�odo da manh�.\n");

			System.out.println("ESSA � SUA REFEI��O:\n");

			if (ovos > 0 && ovos < 2) {
				System.out.println("Ovos: " + ovos);
			} else if (ovos == 0) {
			} else {
				System.out.println("Voc� n�o pode pedir mais de 1 Entrada.");
			}

			if (torrada > 0 && torrada < 2) {
				System.out.println("Torrada: " + torrada);
			} else if (torrada == 0) {
			} else {
				System.out.println("Voc� n�o pode pedir mais de 1 Acompanhamento.");
			}

			if (cafe > 0) {
				System.out.println("Caf�: " + cafe);
			}
			System.out.println("Sobremesa: " + "Nenhuma");
		}

		// Refei��o da Noite
		if (opcao == 2) {

			System.out.println("REFEI��O DA NOITE:");
			System.out.println("1 = Entrada, 2 = Acompanhamento, 3 = Bebida e 4 = Sobremesa.\n");
			System.out.println("1 - Bife");
			System.out.println("2 - Batata");
			System.out.println("3 - Vinho");
			System.out.println("4 - Bolo");
			System.out.println("*ATEN��O: Apenas o acompanhamento pode ser repetido.\n");

			System.out.println("Digite 1 se deseja Bife e 0 caso n�o:");
			bife = input.nextInt();

			System.out.println("Digite a quantidade de Batata que deseja:");
			batata = input.nextInt();

			System.out.println("Digite 1 se deseja Vinho e 0 caso n�o:");
			vinho = input.nextInt();

			System.out.println("Digite 1 se deseja Sobremesa e 0 caso n�o:");
			bolo = input.nextInt();

			System.out.println("ESSA � SUA REFEI��O:\n");

			if (bife > 0 && bife < 2) {
				System.out.println("Bife: " + bife);
			} else if (bife == 0) {
			} else {
				System.out.println("Voc� n�o pode pedir mais de 1 Entrada.");
			}

			if (batata > 0) {
				System.out.println("Batata: " + batata);
			}

			if (vinho > 0 && vinho < 2) {
				System.out.println("Vinho: " + vinho);
			} else if (vinho == 0) {
			} else {
				System.out.println("Voc� n�o pode pedir mais de 1 Bebida.");
			}

			if (bolo > 0 && bolo < 2) {
				System.out.println("Bolo: " + bolo);
			} else if (bolo == 0) {
			} else {
				System.out.println("Voc� n�o pode pedir mais de 1 Sobremesa.");
			}
		}
	}
}
