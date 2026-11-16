public class Ejercicio11_vectores {

    public static void main(String[] args) {

        // ============
        // Ejercicio 11.
        // ============

        int[] numeros = new int[100];
        int [] numeros2 = new int [100];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++)
        {
            contador++;
            numeros[i] = contador;
        }

        for (int i = 0; i < numeros.length; i++)//para copiar y pegar los vectores hace falta usar un bucle (solo sirve en el caso en el que vayamos a modificar uno de los dos)
        {
            numeros2 [i] = numeros [i];
        }

        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println(numeros2 [i]);
        }

    }
}