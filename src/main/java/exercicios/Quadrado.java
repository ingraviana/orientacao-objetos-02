package exercicios;

public class Quadrado {
    private Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double calcularArea() {
        return lado * lado;
    }

    public Double calcularPerimetro() {
        return 4 * lado;
    }
}



