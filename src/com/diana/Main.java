package com.diana;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            // Intentamos abrir el fichero
            File f = new File("C:\\Users\\diana\\OneDrive\\Desktop\\EjercicioB1\\Documentos\\numeros.txt");
            Scanner lector = new Scanner(f);

            int valMin = lector.nextInt();// Declaramos e inicializamos el minimo como el primer numero del fichero
            int valMax=0; // Declaramos e inicializamos el máximo


            // Si llega aquí es que ha abierto el fichero
            while (lector.hasNext()){ //Controlamos que nunca se lean más valores de los que hay disponibles para leer
                int valor = lector.nextInt();

                if (valMax < valor)
                      valMax = valor;

                if (valMin > valor)
                    valMin = valor;
            }

            System.out.println("El máximo del fichero es " + valMax);
            System.out.println("El mínimo del fichero es " + valMin);

            // ¡Hay que cerrar el fichero!
            lector.close();

        } catch (Exception e) {
            // En caso de excepción mostramos el error
            System.out.println("Error: " + e);
            e.printStackTrace();
        }

    }
}
