import java.util.Scanner;
public class Ejercicio6_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 6.
        // ============

        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce el tamaño (N): ");
        int n = entrada.nextInt();

        System.out.println("Introduce el valor para rellenar (M): ");
        int m = entrada.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = m;
        }

        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print(numeros[i] + " ");
        }

    }
}
