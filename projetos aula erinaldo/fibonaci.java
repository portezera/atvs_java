package condicional;

import java.util.Scanner;

public class sequencia_fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
	    System.out.println("quantos termos deseja?:");
	    int qtd = sc.nextInt();
	    int n1 = 1;
	    int n2 = 1;
	    int n3;
		
	    
	    System.out.print("1 ");
	    System.out.print("1 ");
	    //como ja foi declarado 2 termos entao se tira dois do "qtd"
	    qtd = qtd - 2;
	    
	    while (qtd > 0) {
	        System.out.print((n1+n2) + " ");
	        n3 = n1+n2;
	        n1 = n2;
	        n2 = n3;
	        qtd--;
	    }
		 
		
               
	}

}
