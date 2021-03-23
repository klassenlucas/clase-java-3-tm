package ejercicios.ejercicio2;

public class Rectangulo extends FiguraGeometrica {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }


    @Override
    public String toString() {
        return "Rectangulo con base de " + base + ", altura de " + altura + " y un area de " + this.area();
    }
}
