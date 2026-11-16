import java.util.Scanner;
import java.util.Random;
public class Ejercicio12_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 12.
        // ============

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++)
        {
            numeros [i] = (int) (1 + Math.random()*10);
        }


        char letra;
        do {
            System.out.println("Elige una de estas opciones \n" + "a. Mostrar valores \n" + "b. Introducir valor \n" + "c. Salir");
            char letra_1 = entrada.next().charAt(0);
            letra = Character.toLowerCase(letra_1);

            if (letra == 'a')
            {
               for (int i = 0; i < numeros.length; i++)
               {
                   System.out.print(numeros[i] + ", ");
               }
            }else if (letra == 'b')
            {
                System.out.println("Dame un valor (V): ");
                int v = entrada.nextInt();

                System.out.println("Dame una posición (P)");
                int p = entrada.nextInt();

                numeros[p] = v;
            }


        } while (letra != 'c');

        System.out.println("fin");


    }
}
