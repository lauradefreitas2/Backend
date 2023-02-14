public class Main {
    public static void main(String[] args) {
        Figura.Circulo circulo = new Figura.Circulo(5.0);
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        Figura.Quadrado quadrado = new Figura.Quadrado(6.0);
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
    }
}