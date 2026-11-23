import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio18_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 18.
        // ============

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[30];

        for (int i = 0; i < numeros.length; i++ )
        {
            numeros [i] = (int) (Math.random()*10);
        }
        Arrays.sort (numeros);

        System.out.println(Arrays.toString(numeros));

    }
}
