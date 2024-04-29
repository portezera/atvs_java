package condicional;

import java.util.Scanner;

public class atv222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i1, i2 , i3, i4, i5, i6, media, media1;
		
		System.out.println("digite o valor da idade 1:");
		i1 = sc.nextInt();
		System.out.println("digite o valor da idade 2:");
		i2 = sc.nextInt();
		System.out.println("digite o valor da idade 3:");
		i3 = sc.nextInt();
		System.out.println("digite o valor da idade 4:");
		i4 = sc.nextInt();
		System.out.println("digite o valor da idade 5:");
		i5 = sc.nextInt();
		System.out.println("digite o valor da idade 6:");
		i6 = sc.nextInt();
		
		media = i1 + i2 + i3 + i4 + i5 + i6;
		
		media1 = media / 6;
		
		System.out.println("a media é de:");
		System.out.println(media1);
		
		
	}

}
