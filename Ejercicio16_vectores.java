import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio16_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 16.
        // ============

        Scanner entrada = new Scanner(System.in);
        int numeros [] = new int[55]; // el 55 es por lo mismo del ejercicio 14
        int posicion = 0;

        for (int i = 0; i <= 10; i++)
        {
            Arrays.fill (numeros, posicion, posicion + i, i); // mi lógica detrás de esto es que me va a llenar de ese numero desde la ultima posicion hasta la siguiente i con ies
            posicion += i;
        }

        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print(numeros [i] +", ");
        }

    }
}