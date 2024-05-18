public class MultiplosDeTres {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debes ingresar mínimo un argumento.");
            return;
        }

        int multiplosSuma = suma(args);
        double promedioMultiplos = promedio(args);
        System.out.println("Suma de los múltiplos de tres: " + multiplosSuma);
        System.out.printf("Promedio de la suma de los múltiplos de tres: %.0f", promedioMultiplos);
    }

    public static int suma (String[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            int nr = Integer.parseInt(numeros[i]);
            if(nr % 3 == 0) {
                suma += nr;
            }
        }
        return suma;
    }

/*4. Ejercicio 4 - Promedios
Para el mismo problema anterior.
1. Agregar el método promedio() que reciba el arreglo con los valores como parámetro.
2. Deberá calcular el promedio de los números múltiplos de 3.
3. Los datos de entrada se entregarán como parámetros al programa, por lo que para
ejecutar el programa se realizará vía terminal usando el siguiente comando
java MultiplosDeTres.java 10 20 30 33 21 8 2 61
4. Deberá mostrar en pantalla lo siguiente:
84
28
La cantidad de elementos que recibirá el programa es variable.*/

    public static double promedio(String[] numeros) {
        int suma = 0;
        int cantidad = 0;
        for (int i = 0; i < numeros.length; i++) {
            int nr = Integer.parseInt(numeros[i]);
            if(nr % 3 == 0) {
                suma += nr;
                cantidad++;
            }
        }
        return (double) suma / cantidad;
    }
}
