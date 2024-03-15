package condicional;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int opcao;
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o 1 valor: ");
		num1 = sc.nextFloat();
		
		System.out.println("Informe o 2 valor:");
		num2 = sc.nextFloat();
		
		System.out.println("\n\ncalculadora");
		System.out.println("\n1. Soma\n2. Subtração\n3. multiplicação"+
		         "\n4. divisão");
	    System.out.println("\n\nEscolha uma opção:");
	    opcao = sc.nextInt();
	    
	    switch(opcao) {
	     case:1
	         System.out.printf("%f + %f = %f", num1, num2, num1+num2);
	         break;
	     case:2
	         System.out.printf("%f - %f = %f", num1, num2, num1-num2);
	         break;
	     case:3
	         System.out.printf("%f * %f = %f", num1, num2, num1*num2);
	         break;
	     case:4
	         System.out.printf("%f / %f = %f", num1, num2, num1/num2);
	         break;
	    default :
	    	System.out.println("opcao invalida !!!")
	    }
	    sc.close
	}
}
		         