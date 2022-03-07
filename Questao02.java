package DesafioCap2;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe 5 números inteiros: ");

		final int separador = 2;

		int[] vetorN = new int[5];
		for (int i = 0; i < vetorN.length; i++) {
			vetorN[i] = sc.nextInt();
		}
		int cont = 0;
		for (int i = 0; i < vetorN.length; i++) {
			for (int j = 0; j < vetorN.length; j++) {
				int x = vetorN[i] + separador;
				
				if (vetorN[j] == x) {
				
					System.out.printf("[%d,", vetorN[i]);
					System.out.printf("%d]", vetorN[j]);
					
					cont++; 
					
					}
				
				}	 
			
			}
			
			  System.out.printf("\nQuantidade de pares com diferença de 2: "+ cont);
			 
		sc.close();
	}
}
