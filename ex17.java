package atvJulia;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Insira o raio");
		double a = Sc.nextDouble();
		
		double pi = 3.1415;
		
		System.out.println("área: " + (Math.pow(a, 2) * pi + "\nperímetro: " + (2 * pi * a)));

	}

}
