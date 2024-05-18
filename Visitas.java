public class Visitas {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debes ingresar mínimo un número.");
            return;
        }

        //hay que convertir el array de tipo string en int
        int[] visitasDiarias = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            visitasDiarias[i] = Integer.parseInt(args[i]);
        }

        double promedioVisitas = promedio(visitasDiarias);
        System.out.printf("El promedio de visiras diarias es: %.0f", promedioVisitas);
    }

    public static double promedio(int[] visitasDiarias) {
        int suma = 0;
        for (int i = 0; i < visitasDiarias.length; i++) {
              suma += visitasDiarias[i];
        }
        return (double) suma / visitasDiarias.length;
    }
}
