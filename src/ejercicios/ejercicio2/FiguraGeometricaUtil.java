package ejercicios.ejercicio2;

public class FiguraGeometricaUtil {

    public static double areaPromedio(FiguraGeometrica arr[]) {
        double areaTotal = 0;
        for (FiguraGeometrica f: arr) {
            areaTotal += f.area();
        }
        return areaTotal / arr.length;
    }

}
