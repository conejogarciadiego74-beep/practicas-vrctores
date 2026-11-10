import java.util.Scanner;
public class Ejercicio1_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 1.
        // ============

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 10 números enteros");

        int numeros[] = new int [10];
        int i = 0;
        for (i = 0; i < 10; i++)
        {
            numeros[i] = entrada.nextInt();
        }
        System.out.print(numeros[0] +", " + numeros[1] +", " + numeros[2] +", " + numeros[3] +", " + numeros[4] +", " + numeros[5] +", "  + numeros[6] +", "  + numeros[7] +", "  + numeros[8] +", "  + numeros[9]);


    }
}
