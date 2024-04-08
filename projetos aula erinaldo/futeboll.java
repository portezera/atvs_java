//ALGORITMO
DECLARE cont_time, cont_jog, idade NUMÉRICO
peso, alt, qtde, media_idade NUMÉRICO
media_altura, porc, tot80 NUMÉRICO
qtde ← 0
tot80 ← 0
PARA cont_time ← 1 ATÉ 5 FAÇA
INÍCIO
media_idade ← 0
PARA cont_jog ← 1 ATÉ 11 FAÇA
INÍCIO
leia idade, peso, alt
SE idade < 18
ENTÃO qtde ← qtde + 1
media_idade ← media_idade + idade
media_altura ← media_altura + alt
SE peso > 80
ENTÃO tot80 ← tot80 + 1
FIM
media_idade
ESCREVA media_idade ← media_idade/11
FIM
ESCREVA qtde
media_altura ← media_altura/55
ESCREVA media_altura
porc ← tot80 * 100/55
ESCREVA porc
FIM_ALGORITMO.
//=====================================================================================
package titio;

import java.util.Scanner;

public class futbol {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//variaveis
		int cont_time,cont_jogador,idade,peso,alt,qtde,media_idade,media_altura,porc,tot80;
		
		qtde = 0;
		tot80 = 0;
		
		for( cont_time = 5) {
			System.out.println("qual a idade do jogador?:");
			idade = sc.nextInt();
			
			System.out.println("qual o peso do jogaor?:");
			idade = sc.nextInt();
			
			System.out.println("qual a altura do jogador?:");
			alt = sc.nextInt();
			
			if (idade <18 = )
			
		}

		
	}

}
