package condicional;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		float n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a 1 nota:");
		n1 = sc.nextFloat();
		
		System.out.println("Informe a 2 nota: ");
		n2 = sc.nextFloat();
		
		System.out.println("informe a 3 nota:");
		n3 = sc.nextFloat();
		
		float media = (n1+n2+n3)/3;
		String resultado;
		
		if (media >= 6.0) {
			resultado = "aprovado";
		} else {
			resultado = "reprovado";
		}
		System.out.printf("\nO aluno obteve a média %.1f e está %s", media, resultado);
	}

}
