package atvJulia;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Insira os anos");
		double a = Sc.nextDouble();
		
		System.out.println("Insira os meses");
		double b = Sc.nextDouble();

		System.out.println("Insira os dias");
		double c = Sc.nextDouble();
		
		System.out.println(((a * 365) + (b * 30) + c));
	}

}
