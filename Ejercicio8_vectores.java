import java.util.Random;
import java.util.Scanner;
public class Ejercicio8_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 8.
        // ============

        Scanner entrada = new Scanner(System.in);

        double numeros [] = new double[100];
        Random rand = new Random();

        for (int i = 0; i < numeros.length; i++)
        {
            numeros [i] = rand.nextDouble();
        }

        System.out.println("Introduce un valor entre 0 y 1");
        double num = entrada.nextDouble();
        int mayores = 0;

        if (num < 0 || num > 1)
        {
            System.out.println("Has introducido un número no válido");
        }
        else
        {
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] >= num) {
                    mayores ++;
                }//si ninguno de los numeros es mayor que r pues se pone 0 solo supongo
            }

            System.out.println("Hay " + mayores + " números mayores o iguales que el tuyo en el array");
        }



    }
}
