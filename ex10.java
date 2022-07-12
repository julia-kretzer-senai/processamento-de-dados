package atvJulia;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Insira um número");
		int a = Sc.nextInt();
		
		int ant = a - 1;
		int suc = a + 1;
		
		System.out.println(ant + "\n" + suc);

	}

}
