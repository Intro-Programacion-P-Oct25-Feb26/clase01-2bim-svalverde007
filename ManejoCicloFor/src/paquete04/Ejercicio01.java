/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author UTPL
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        // Declaramos todas las variables variables 
        String mensaje = "";
        int sumaTotal1 = 0;
        int sumaTotal2 = 0;
        int sumaTotal3 = 0;
        int sumaTotal4 = 0;
        int valor1;
        int valor2;
        int valor3;
        int valor4;

        // Aqui inicio el ciclo "Para"
        for (int i = 30; i >= 10; i--) {

            // Le asigno operaciones a cada variable
            valor1 = i;
            valor2 = 2 * i;
            valor3 = 3 * i;
            valor4 = 4 * i;

            mensaje = String.format("%s%n%d-%d-%d-%d",
                    mensaje, valor1, valor2, valor3, valor4);
            // Aqui sumamos todos los valores para sacar el total
            sumaTotal1 = valor1 + sumaTotal1;
            sumaTotal2 = valor2 + sumaTotal2;
            sumaTotal3 = valor3 + sumaTotal3;
            sumaTotal4 = valor4 + sumaTotal4;

        }
        // aqui estoy añadiéndole la línea de totales

        mensaje = String.format("%s%nTotales = %d-%d-%d-%d\n", mensaje,
                sumaTotal1, sumaTotal2, sumaTotal3, sumaTotal4);
        //luego imprimotodo el resultado
        System.out.printf(mensaje);
    }
}
