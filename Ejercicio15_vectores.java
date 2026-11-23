import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio15_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 15.
        // ============

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el tamaño (N)");
        int n = entrada.nextInt();

        System.out.println("Introduce el valor (M)");
        int m = entrada.nextInt();

        int numeros [] = new int[n];

        Arrays.fill (numeros, m);

        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print(numeros [i] + ", ");
        }

    }
}
