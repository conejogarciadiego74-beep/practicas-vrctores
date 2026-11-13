import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio10_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 10.
        // ============

        Scanner entrada = new Scanner(System.in);

        double alturas[] = new double[7];
        double suma = 0;

        for (int i = 0; i < alturas.length; i++)// lo mismo que llevo haciendo en el resto de ejercicios un bucle que sirve para preguntarme un número determinado de veces
        {
            System.out.print("Introduce la altura " + (i + 1) + ": ");
            alturas[i] = entrada.nextDouble();
            suma += alturas [i];
        }

        double media = suma / alturas.length;
        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < alturas.length; i++)
        {
            if (alturas[i] > media)
            {
                mayor ++;
            }else
            {
                menor ++;
            }
        }
        System.out.println("La media es: " + media);
        System.out.println("Hay " + mayor + " personas por encima de la media");
        System.out.println("Hay " + menor + " personas por debajo de la media");
    }
}
