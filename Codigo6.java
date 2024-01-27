package codigoOtros6;

import java.util.Scanner;

//Paulina Mendoza 5
//Rene Gomez      5

//Rene mantuvo la camara activa siempre y explicaba cada corrección. 

public class Codigo6 {
      public static void main(String[] args) {
    int[] n = new int[20]; //Corregida la creación del array

    for (int i = 0; i < 20; i++) { //Corregido el incremento de i
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " "); //Corregido el sysout
    }
    
    System.out.println("\n¿Qué números quiere resaltar? "); //Corregido sysout en println en el lugar de print
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    Scanner scanner = new Scanner(System.in);
    int eleccion = scanner.nextInt();   
    // No se puede usar Console por eso se usa Scanner
    //int opcion = Integer.parseInt(System.console().readLine());
    scanner.close();
    int multiplo = (eleccion == 1) ? 5 : 7; //Corregido el operador ternario

    for ( int e : n) { //Se cambia char e por int e
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      }
       else {
        System.out.print(e + " "); //se corrigió out
      }
    }
}
}