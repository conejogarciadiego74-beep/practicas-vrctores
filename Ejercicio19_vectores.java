import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio19_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 19.
        // ============

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[8];
        for (int i = 0; i < numeros.length; i++)// lo mismo que llevo haciendo en el resto de ejercicios un bucle que sirve para preguntarme un número determinado de veces
        {
            System.out.print("Introduce el ELO " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        Arrays.sort(numeros);

        int invertido [] = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++)
        {
            invertido [i] = numeros[numeros.length-1 - i];//para gonzalo no sé porq estaba usando binary search y no habia pensado en esto que es 1000 veces mas facil
        }
        System.out.println(Arrays.toString(invertido));

    }
}
