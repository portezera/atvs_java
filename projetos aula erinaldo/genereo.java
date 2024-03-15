package condicional;

import java.util.Scanner;

public class Genero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char genero;
		
		System.out.println("Digite o F para feminino ou M para masculino: ");
		genero = sc.next().charAt(0);
		genero = Character.toUpperCase(genero);
		
		System.out.println((genero == 'F') ? "feminino" : (genero == 'M') ? "Masculino" : "valor válido");
		
		sc.close();
	}

}
