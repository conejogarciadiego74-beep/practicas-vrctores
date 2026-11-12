import java.util.Scanner;
public class Ejercicio7_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 7.
        // ============

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce P");
        int p = entrada.nextInt();

        System.out.println("Introduce Q");
        int q = entrada.nextInt();

        int tamano = 0;
        int var = 0; // Esta variable es la que me hace que pase un 1 o un -1 según tenga que aumentar o bajar la escala

        if (p <= q)
        {
             tamano = q - p;

             var = 1;

        }else
        {
           tamano = p - q;

           var = -1;

        }
        int numeros [] = new int [tamano];

        for (int i = 0; i < tamano; i++)
        {
            numeros[i] = p + i * var;//se explica solo pero es para que me multiplique por 1 si hace falta sumar o -1 si restar
        }

        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println(numeros [i] + " ");
        }

    }
}
