package condicional;

import java.util.Scanner;

public class potencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fim,i,j,x,expoente, numdetermos;
		int den = 0,denominador,fat,snumerico;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantos termos deseja?:");
		numdetermos = sc.nextInt();
		
		System.out.println("qual o valor de x?:");
		x = sc.nextInt();
		
		snumerico=0;
		denominador=1;
		
		//o numero de termos vai de + em + ate o valor colocado  
		for (i=1;i <= numdetermos;i++) { 
			
			fim = denominador;
			fat = 1;
			for (j = 1; j<=fim;j++ ) {
				fat *= j;
				//fat = fat * j;
		
			}
			expoente = i + i;
			if ( ( expoente %2 ) ==0 )
            snumerico = snumerico-(int)Math.pow(x,expoente);
			else 
				snumerico += (int)Math.pow(x,expoente)/fat;
			if (denominador == 4)
				den = -1;
			if (denominador == 1)
				den=1;
			if (den==1)
				//denominador = denominador + 1
				denominador += 1;
			else 
				denominador -= 1;
			
			System.out.printf("%d ",snumerico);
		}
		
		
	}

}
