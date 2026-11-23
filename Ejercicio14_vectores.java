import java.util.Scanner;
public class Ejercicio14_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 14.
        // ============

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[55];
        int cont = 0;//este contador lo explico mas adelante
        // pongo 55 porque siguiendo la secuencia del enunciado caben 55 numeros
        //para cada numero introducir la misma cantidad, es decir con el 2 el bucle tiene que poner 2 2 veces y asi sucesivamente
        for (int i = 1; i <= 10; i++)
        {
            for (int cantidad = 0; cantidad < i; cantidad++)
            {// esto lo que hace es que me pone el numero hasta que llegue a i que es el contador que está subiendo
                numeros[cont] = i;
                cont++;
            }
        }

        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print(numeros[i] + ", ");
        }

    }
}
