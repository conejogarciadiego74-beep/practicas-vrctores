import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio20_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 20.
        // ============

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[1000];

        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = (int) (Math.random()*100);
        }

        System.out.println("Introduce un numero y te diré cuantas veces aparece en el array");
        int n = entrada.nextInt();
        int cont = 0;

        for (int i = 0; i < numeros.length; i++)
        {
            if (numeros [i] == n)
            {
                cont ++;
            }

        }
        System.out.println("Hay " + cont + " números iguales a " + n + " en el array");

    }
}
