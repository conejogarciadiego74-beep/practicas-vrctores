import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio9_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 9.
        // ============

        Scanner entrada = new Scanner(System.in);


        int numeros [] = new int[100];

        for (int i = 0; i < numeros.length; i++)
        {
            numeros [i] = (int) (1 + Math.random()*10);
        }

        System.out.println("Introduce un número del 1 al 10");
        int num = entrada.nextInt();

        if (num < 1 || num > 10)
        {
            System.out.println("Debe de estar entre 0 y 10");
        }else
        {
            for (int i = 0; i < numeros.length; i++)
            {
                if (num == numeros[i])
                {
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
