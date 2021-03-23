package ejercicios.ejercicio2;

public class Circulo extends FiguraGeometrica {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radio,2);
    }


    @Override
    public String toString() {
        return "Circulo con radio de " + radio + " y un area de " + this.area();
    }
}
