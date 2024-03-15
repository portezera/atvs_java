package condicional;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		float peso, altura;
		String classificacao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o peso: ");
		peso = sc.nextFloat();
		
		System.out.println("Informe a altura: ");
		altura = sc.nextFloat();
		
		double imc = peso/(Math.pow(altura,  2));
		
		if (imc < 18.5) {
			classificacao = "abaixo do peso";
		} else if (imc < 25) {
			classificacao = "peso normal";
		} else if (imc < 30) {
			classificacao = "sobrepeso";
		} else if (imc < 35) {
			classificacao = "obesidade nível I";
		} else if (imc < 40) {
			classificacao = "obsidade nivel II";
		} else {
			classificacao = "obesidade mórbida";
		}
		
		System.out.printf("\nO seu imc é %.2f"+"e está classificado como %s", imc, classificacao);
		
		sc.close();
	}
		
}
