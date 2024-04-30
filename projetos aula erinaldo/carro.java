package condicional;

import java.util.Scanner;

public class atv9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int carro,escolha1, escolha;
		double preço_final,porcentagem1,preco;
		double porcentagem = 0;
		
		System.out.println("digite o valor do carro:");
		carro = sc.nextInt();
		
		System.out.println("======================================================================================");
		System.out.println("A quantidade de parcelas pode ser: 6, 12, 18, 24, 30, 36, 42, 48, 54 e 60 meses");
		System.out.println("sendo .............................3%..6%..9%..12%.15%.18%.21%.24%.27%..30% de juros");
		System.out.println("compra à vista tem desconto de 20%");
		System.out.println("======================================================================================");
		
		System.out.println("quer pagar a vista digite 1, se nao digite 2:");
		escolha1 = sc.nextInt();
		
		switch (escolha1) {
		case 1:
			porcentagem = 0.20;
			preco = carro * porcentagem;
			preço_final = carro - preco;
			
			System.out.println("o valor final vista é:");
			System.out.println(preço_final);
			break;
		case 2:
			porcentagem = 0;
			break;
		}

		
		System.out.println("digite quantas vezes quer parcelar 6, 12, 18, 24, 30, 36, 42, 48, 54 e 60:");
		escolha = sc.nextInt();
		
		switch (escolha) {
			case 6:
				porcentagem = 0.03;
				break;
			case 12:
				porcentagem = 0.06;
				break;
			case 18:
				porcentagem = 0.09;
				break;
			case 24:
				porcentagem = 0.12;
				break;
			case 30:
				porcentagem = 0.15;
				break;
			case 36:
				porcentagem = 0.18;
				break;
			case 42:
				porcentagem = 0.21;
				break;
			case 48:
				porcentagem = 0.24;
				break;
			case 54:
				porcentagem = 0.27;
				break;
			case 60:
				porcentagem = 0.30;
				break;
		}
		
		
		preco = carro * porcentagem;
		preço_final = carro + preco;
		
		
		System.out.println("o valor final com juros é:");
		System.out.println(preço_final);
		
		
	}

}
