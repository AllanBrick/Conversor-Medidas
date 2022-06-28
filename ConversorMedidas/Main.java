package ConversorMedidas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Temperatura tp = new Temperatura();
		Volume vol = new Volume();
		Peso peso = new Peso();
		Comprimento comp = new Comprimento();

		System.out.println("ESCOLHA:");
		System.out.println("1-TEMPERATURA\n2-VOLUME\n3-COMPRIMENTO\n4-PESO");

		int escolha = ler.nextInt();

		switch (escolha) {
		case 1:
			System.out.println(
					"1-CELSIUS-FAHRENHEIT\n2-CELSIUS-KELVIN\n3-FAHREINHEIT-CELSIUS\n4-FAHREINHEIT-KELVIN\n5-KELVIN-CELSIUS\n6-KELVIN-FAHREINHEIT");

			int escolhaTemp = ler.nextInt();

			switch (escolhaTemp) {
			case 1:
				System.out.println("DIGITE UM N�");

				double nm1 = ler.nextDouble();
				tp.celsiusToFah(nm1);

				break;
			case 2:
				System.out.println("DIGITE UM N�");

				double nm2 = ler.nextDouble();
				tp.celsiusToKelvin(nm2);

				break;
			case 3:
				System.out.println("DIGITE UM N�");

				double nm3 = ler.nextDouble();
				tp.fahToCelsius(nm3);

				break;
			case 4:
				System.out.println("DIGITE UM N�");

				double nm4 = ler.nextDouble();
				tp.fahToKelvin(nm4);

				break;
			case 5:
				System.out.println("DIGITE UM N�");

				double nm5 = ler.nextDouble();
				tp.kelvinToCelsius(nm5);

				break;
			case 6:
				System.out.println("DIGITE UM N�");

				double nm6 = ler.nextDouble();
				tp.kelvinToFahreinheit(nm6);

				break;

			default:
				break;
			}
break;
		case 2:

			System.out.println(
					"ESCOLHA:\n1-LITRO-GALAO\n2-LITRO-ON�A\n3-GALAO-LITRO\n4-GALAO-ON�A\n5-ON�A-LITRO\n6-ON�A-GALAO");

			int escolhaVol = ler.nextInt();

			switch (escolhaVol) {
			case 1:
				System.out.println("DIGITE UM N�");

				double nm1 = ler.nextDouble();
				vol.litrosToGalao(nm1);

				break;
			case 2:
				System.out.println("DIGITE UM N�");

				double nm2 = ler.nextDouble();
				vol.litrosToOnca(nm2);

				break;
			case 3:
				System.out.println("DIGITE UM N�");

				double nm3 = ler.nextDouble();
				vol.galaoToLitros(nm3);

				break;
			case 4:
				System.out.println("DIGITE UM N�");

				double nm4 = ler.nextDouble();
				vol.galaoToOnca(nm4);

				break;
			case 5:
				System.out.println("DIGITE UM N�");

				double nm5 = ler.nextDouble();
				vol.oncaToLitros(nm5);

				break;
			case 6:
				System.out.println("DIGITE UM N�");

				double nm6 = ler.nextDouble();
				vol.oncaToGalao(nm6);

				break;

			default:
				break;

			}
			break;
		case 3:
			System.out.println(
					"ESCOLHA:\n1-METRO-P�S\n2-METRO-POLEGADA\n3-P�S-METRO\n4-P�S-POLEGADA\n5-POLEGADA-METRO\n6-POLEGADA-P�S");

			int escolhaComp = ler.nextInt();

			switch (escolhaComp) {

			case 1:
				System.out.println("DIGITE UM N�");

				double nm1 = ler.nextDouble();
				comp.metrosToPes(nm1);

				break;
			case 2:
				System.out.println("DIGITE UM N�");

				double nm2 = ler.nextDouble();
				comp.metrosToPolegadas(nm2);

				break;
			case 3:
				System.out.println("DIGITE UM N�");

				double nm3 = ler.nextDouble();
				comp.pesToMetros(nm3);

				break;
			case 4:
				System.out.println("DIGITE UM N�");

				double nm4 = ler.nextDouble();
				comp.pesTopolegadas(nm4);

				break;
			case 5:
				System.out.println("DIGITE UM N�");

				double nm5 = ler.nextDouble();
				comp.polegadsToMetros(nm5);

				break;
			case 6:
				System.out.println("DIGITE UM N�");

				double nm6 = ler.nextDouble();
				comp.polegadasToPes(nm6);

				break;

			default:
				break;
			}
			break;
		case 4:
			System.out.println(
					"ESCOLHA:\n1-QUILO-LIBRA\n2-QUILO-ON�A\n3-LIBRA-QUILO\n4-LIBRA-ON�A\n5-ON�A-QUILO\n6-ON�A-LIBRA");

			int escolhaPeso = ler.nextInt();

			switch (escolhaPeso) {

			case 1:
				System.out.println("DIGITE UM N�");

				double nm1 = ler.nextDouble();
				peso.kgToLibras(nm1);

				break;
			case 2:
				System.out.println("DIGITE UM N�");

				double nm2 = ler.nextDouble();
				peso.kgToOnca(nm2);

				break;
			case 3:
				System.out.println("DIGITE UM N�");

				double nm3 = ler.nextDouble();
				peso.librasToKg(nm3);

				break;
			case 4:
				System.out.println("DIGITE UM N�");

				double nm4 = ler.nextDouble();
				peso.librasToOnca(nm4);

				break;
				
			case 5:
				System.out.println("DIGITE UM N�");

				double nm5 = ler.nextDouble();
				peso.oncaToKg(nm5);

				break;
			case 6:
				System.out.println("DIGITE UM N�");

				double nm6 = ler.nextDouble();
				peso.oncaTolibras(nm6);

				break;

			default:
				break;
			}
			
			break;
			default:
				break;
		}
	}
}
