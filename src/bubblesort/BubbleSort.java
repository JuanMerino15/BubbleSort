/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author juan
 */
public class BubbleSort {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
/**
     * @param args the command line arguments
     */
	public static void main(String[] args) throws IOException {
            // Declaracion de variables
        int n, a, b;
        

        // Creamos el objeto

        System.out.println("Introduzca longitud del array: ");
        //Guardamos en N el tamaño del arreglo
        entrada = bufer.readLine();
        n = Integer.parseInt(entrada);

        // Creamos el tamaño del array
        int ArrayN[] = new int[n];

        //Bucle para rellenar el array 
        for (int i = 0; i < ArrayN.length; i++) {
            System.out.println("Introduzca número para el elemento " + (i + 1) + ": ");
            entrada = bufer.readLine();
            ArrayN[i] = Integer.parseInt(entrada);
        }
        // Se muestra el array sin ordenar
        System.out.println("      -SIN ORDENAR-");
        //Llamamos al metodo
        mostrarN(ArrayN);
        // Aqui ya se mostrara el array ordenado
            System.out.println("       -ORDENADO-   ");
            // Llaamos al metodo ordenado
            ordenaBurbuja(ArrayN);
        }

    
    
    // Método de ordenación/
    static void ordenaBurbuja(int ArrayN[]) {
        // Bucle desde 0 
        for (int i = 0; i < ArrayN.length - 1; i++) {
            // Bucle desde 0 hasta la longitud del array -1 
            for (int j = 0; j < ArrayN.length - 1; j++) { /* Si el número almacenado en la posición j es mayor que el de la posición j+1 (el siguiente del array) */ if (ArrayN[j] > ArrayN[j + 1]) {
                    //guardamos el número de la posicion j+1 en una variable 
                    int temp = ArrayN[j + 1];
                    //Lo intercambiamos de posición
                    ArrayN[j + 1] = ArrayN[j];
                    ArrayN[j] = temp;
                    // y volvemos al inicio para comparar los siguientes hasta que todos se hayan comparado
                    // de esta forma vamos dejando los números mayores al final del array en orden
                }
            }
        }
       
        mostrarN(ArrayN);
    }
    
    //Método para mostrar el array
    static void mostrarN(int ArrayN[]) {
        System.out.println("|-----------------------|");
        //Bucle para mostrar el array desde la posicion 0 hasta la longitud del array 
        for (int i = 0; i < ArrayN.length; i++) { System.out.print(" Elemento " + (i + 1) + " -----> " + ArrayN[i] + "\n");
        }
        System.out.println("|-----------------------|");
    }

}
