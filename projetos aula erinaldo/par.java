package condicional;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String resultado;
		
		System.out.println("Informe o número: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			resultado = "par";
			System.out.printf("O número %d é par ;\n", num);
		} else {
			resultado = "ímpar";
		}
		System.out.println("\nEncerramento do programa...");
		
		sc.close();
	}

}
