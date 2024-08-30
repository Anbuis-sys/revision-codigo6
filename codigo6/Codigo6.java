package com.codigo6;

import java.util.Scanner;

public class Codigo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[20]; // correccion en la declaracion del tipo de dato

	    for (int i = 0; i < 20; i++) { // ++
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " "); 
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    Scanner sc  = new Scanner(System.in); //importacion de un scanner
	    int opcion = sc.nextInt(); // linea cambiada por scanner

	    int multiplo = ((opcion == 1) ? 5 : 7); //correccion en el operadpr ternario
         //for(e=0; e<=n; e++)
	    for (int e : n) { //cambio de foreach a for y de char a int
	      if (e % multiplo == 0) {
	        System.out.print( e + " " ); //cambio en los mensajes
	      }
	    }
	  sc.close();
	}
	}
