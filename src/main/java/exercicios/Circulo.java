package exercicios;

public class Circulo {
    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double calcularArea(){

        return 3.0 * (raio * raio);
    }

    public Double calcularPerimetro(){

        return  2 * 3.0 * raio;
    }
}
