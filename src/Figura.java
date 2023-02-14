public class Figura {

    public static class Circulo extends Figura {
        private double raio;

        public Circulo(double raio) {
            this.raio = raio;
        }

        public double calcularPerimetro() {
            return 2 * Math.PI * raio;
        }
    }

    public static class Quadrado extends Figura {
        private double lado;

        public Quadrado(double lado) {
            this.lado = lado;
        }

        public double calcularPerimetro() {
            return 4 * lado;
        }
}
    }
