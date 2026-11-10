import java.util.Scanner;
public class Ejercicio3_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 3.
        // ============

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];


        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++)//me recorre el array hasta que i sea mayor o menor que máximo o mínimo
        {
            if (numeros[i] > maximo)
            {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo)
            {
                minimo = numeros[i];
            }
        }


        System.out.println("El máximo es: " + maximo);
        System.out.println("El mínimo es: " + minimo);
    }
}
