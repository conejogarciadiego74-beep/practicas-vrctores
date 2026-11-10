import java.util.Scanner;
public class Ejercicio4_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 3.
        // ============

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[20];
        int positivos = 0;
        int negativos = 0;


        for (int i = 0; i < numeros.length; i++)// lo mismo que llevo haciendo en el resto de ejercicios un bucle que sirve para preguntarme un número determinado de veces
        {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < numeros.length; i++)
        {
            if (numeros [i] > 0)//se explica sólo (los numeros positivos se suman en su suma de positivos y los negativos en la suya)
            {
                positivos += numeros[i];
            }else if (0 > numeros[i])
            {
                negativos += numeros[i];
            }
        }

        System.out.println("Suma de positivos = " + positivos);
        System.out.println("Suma de negativos = " + negativos);


    }
}
