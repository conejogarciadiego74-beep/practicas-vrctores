import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio17_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 17.
        // ============

        Scanner entrada = new Scanner(System.in);

        int numeros1[] = new int[10];
        int numeros2[] = new int [10];

        for (int i = 0; i < numeros1.length; i++)// lo mismo que llevo haciendo en el resto de ejercicios un bucle que sirve para preguntarme un número determinado de veces
        {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros1[i] = entrada.nextInt();
        }

        for (int i = 0; i < numeros1.length; i++)// lo mismo que llevo haciendo en el resto de ejercicios un bucle que sirve para preguntarme un número determinado de veces
        {
            System.out.print("Introduce el número " + (i + 11) + ": ");
            numeros2[i] = entrada.nextInt();
        }

        System.out.println("Matriz 1: ");
        System.out.println(Arrays.toString(numeros1));

        System.out.println("Matriz 2: ");
        System.out.println(Arrays.toString(numeros2));

        if (Arrays.equals(numeros1, numeros2))
        {
            System.out.println("Son iguales");
        }else
        {
            System.out.println("No son iguales");
        }








    }
}