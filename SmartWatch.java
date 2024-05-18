import java.util.ArrayList;
import java.util.List;

public class SmartWatch {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debes ingresar mínimo un número.");
            return;
        }

        double promedioPasos = clearSteps(args);

        System.out.printf("El promedio de pasos diarios es: %.0f", promedioPasos);
    }

    public static double clearSteps(String[] pasos) {
        ArrayList<Integer> pasosReales = new ArrayList<>();

        int suma = 0;

        for (int i = 0; i < pasos.length; i++) {
            int paso = Integer.parseInt(pasos[i]);
            if (paso > 200 && paso < 100000) {
                pasosReales.add(paso);
                suma += paso;
            }
        }

        return (double) suma / pasosReales.size();
    }
}
