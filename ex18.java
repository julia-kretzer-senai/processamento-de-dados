package atvJulia;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Insira a base");
		double a = Sc.nextDouble();
		
		System.out.println("Insira a altura");
		double b = Sc.nextDouble();
		
		System.out.println("área: " + ((a * b)/2));

	}

}
