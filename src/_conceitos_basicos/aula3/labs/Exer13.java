package _conceitos_basicos.aula3.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o dia da semana (1 - 7): ");

		int diaSemana = scan.nextInt();

		switch (diaSemana) {

		case 1:
			System.out.println("Domingo!");
			break;

		case 2:
			System.out.println("Segunda feira!");
			break;
		case 3:
			System.out.println("Ter�a feira!");
			break;
		case 4:
			System.out.println("Quarta feira!");
			break;
		case 5:
			System.out.println("Quinta feira!");
			break;
		case 6:
			System.out.println("Sexta feira!");
			break;
		case 7:
			System.out.println("Sabado feira!");
			break;

		default:
			System.out.println("N�o � um dia da semana v�lido!...");
		}

	}

}
