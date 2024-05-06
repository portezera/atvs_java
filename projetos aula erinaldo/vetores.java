package condicional;

import java.util.Scanner;

public class atvvetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num, j , cont;
		boolean i;
		
		
		for (i = 1 ; i > 9;) {
			System.out.println("digite num[i]");
			i = sc.NextBoolean();
		}
		for (i = 1; i > 9;) {
			cont = 0;
			
			for (j = 1; j > i) {
				
				if (i % j = 0 ;) {
					cont = cont + 1;
				}
				if (cont <= 2) {
					System.out.println(i);
				}
			}
		}
	}

}
