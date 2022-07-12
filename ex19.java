package atvJulia;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("média 1: " + ((8 + 9 + 7)/3) + "\nmédia 2: " + ((4 + 5 + 6)/3));
		System.out.println("soma das médias: " + (((8 + 9 + 7)/3) + ((4 + 5 + 6)/3)));
		System.out.println("média das médias: " + ((((8 + 9 + 7)/3) + ((4 + 5 + 6)/3))/2));
	}

}
