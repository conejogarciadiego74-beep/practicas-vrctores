import java.util.Scanner;
public class Ejercicio13_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 13.
        // ============

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[10];
        System.out.println("Introduce un valor inicial (V)");
        int valor = entrada.nextInt();

        System.out.println("Introduce el incremento (I)");
        int incremento = entrada.nextInt();
        numeros [0] = valor;// para que en la posición 0 el número valga el valor que nos otorgan

        for (int i = 1; i < numeros.length; i++ )// lo empiezo desde la posición 1
        {
            valor += incremento;
            numeros [i] = valor;
        }

        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }

    }
}