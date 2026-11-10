import java.util.Scanner;
public class Ejercicio2_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 2.
        // ============

        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce 10 números enteros");

        int numeros[] = new int [10];
        int i = 0;
        int suma = 0;
        for (i = 0; i < 10; i++)
        {
            numeros[i] = entrada.nextInt();

            suma += numeros [i];
        }
        System.out.println(suma);

    }
}
