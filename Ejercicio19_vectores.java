import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio19_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 19.
        // ============

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[8];
        for (int i = 0; i < numeros.length; i++)// lo mismo que llevo haciendo en el resto de ejercicios un bucle que sirve para preguntarme un número determinado de veces
        {
            System.out.print("Introduce el ELO " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        Arrays.sort(numeros);

    }
}
