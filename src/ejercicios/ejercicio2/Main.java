package ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(10);
        Triangulo t = new Triangulo(3,6);
        Rectangulo r = new Rectangulo(7,2);

        FiguraGeometrica arr[] = {c,t,r};

        System.out.println(c);
        System.out.println(t);
        System.out.println(r);
        System.out.println("Promedio de areas: " + FiguraGeometricaUtil.areaPromedio(arr));

    }
}
