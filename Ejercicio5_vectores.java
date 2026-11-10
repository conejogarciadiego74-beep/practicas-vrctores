import java.util.Scanner;
public class Ejercicio5_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 5.
        // ============

        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[20];// le pongo double porq luego la media me puede dar con decimales entonces pa quitarme de problemas lo pongo
        double suma = 0;

        for (int i = 0; i < numeros.length; i++)// lo mismo que llevo haciendo en el resto de ejercicios un bucle que sirve para preguntarme un número determinado de veces
        {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();
            suma += numeros[i];
        }

        double media = suma / numeros.length;
        System.out.println("La media es: " + media);




    }
}
