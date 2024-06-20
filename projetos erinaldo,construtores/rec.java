package provas;

import java.util.Scanner;

public class Recuperacao {
	
	Scanner sc = new Scanner(System.in);
	String nome;
	int identificador, veiculospasseio, qtdacidentes;
	
	public Recuperacao (String nome) {
		System.out.println("qual o nome da cidade?:");
		nome = sc.toString();
		
		System.out.println("qual o codico da cidade?:");
		identificador = sc.nextInt();
		
		System.out.println("qual a quantidade de veiculos de passeio?:");
		veiculospasseio = sc.nextInt();
		
		System.out.println("qual a quantidade de acidentes na cidade?:");
		qtdacidentes = sc.nextInt();
	}
}

