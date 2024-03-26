package condicional;

import java.util.Scanner;

public class Atv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int anoi;
           int anoa;
           float novosalario;
           float salario;
           float porcentual;
           
           Scanner sc = new Scanner(System.in);
           System.out.println("informe o ano atual:");
           anoa = sc.nextInt();
           
           salario = 1000f;
           porcentual = (float) (1.5/100);
           
           novosalario = salario + porcentual * salario;
           
           for (anoi = 2007; anoi <= anoa; anoi++) {
        	   //porcentual = 2 * porcentual;
        	   porcentual *= 2;
        	   //novosalario = novosalario + porcentual * novosalario;
        	   novosalario += novosalario * porcentual;   
           }
           System.out.printf("o salario atual é: R$ %.2f",novosalario);
        	   
	}

}
