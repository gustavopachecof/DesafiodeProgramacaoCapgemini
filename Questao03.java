package Desafio1234;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		
		String strSemEspacos = texto.replaceAll("\\s+","");
		int caracteresString = strSemEspacos.length();
		System.out.println("\nQuantidade de caracteres da string informada sem os espaços: ");
		System.out.println(caracteresString);
		
		double raizCaracteres = Math.sqrt(caracteresString);
		System.out.println("\nRaiz da quantidade de caracteres: ");
		System.out.println(raizCaracteres);
		
		int numeroArredondado = (int)Math.ceil(raizCaracteres);
		
		System.out.println("\nRaiz Arredondada para cima: ");
		System.out.println(numeroArredondado);
		
		
        String textoFinal = "";
		for(int i = 0 ; i < numeroArredondado ; i++){
		    
		    String aux1 = "";
		    int busca = 0 + i;
		    for(int j = 0 ; j < numeroArredondado ; j++){
		        
		        if(busca < strSemEspacos.length()){
		            aux1 = aux1 + strSemEspacos.charAt(busca);
		        }
		        
		        busca = busca + numeroArredondado;
		    }
		    textoFinal = textoFinal + aux1 + " ";
		    
		}
       
        
		System.out.println("\nEncriptografado: ");
		System.out.println(textoFinal);	
		
		
		}

	}


