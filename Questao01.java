package DesafioCap1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Questao01 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Integer> numeros = new ArrayList<Integer>();
	System.out.println("Informe uma quantidade ímpar de números para calcularmos a mediana: ");
	
	int y = 0;
	
	while (y == 0) {
		int valor = sc.nextInt();
		numeros.add(valor);
		System.out.print("Deseja informar mais valores? Digite: 0 para Sim / 1 para Não ");  
		y = sc.nextInt();
	}
	
	Collections.sort(numeros);
	System.out.println(numeros);
	int sizeUtil = numeros.size() - 1;
	int medianaIndex = (sizeUtil)/2;
			

	System.out.println("A mediana é o número: "  + numeros.get(medianaIndex));
	
	sc.close();
	}

}
