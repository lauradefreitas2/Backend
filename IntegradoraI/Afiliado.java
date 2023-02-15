package IntegradoraI;

public class Afiliado extends Vendedor {
    public Afiliado(String nome) {
        super(nome);
    }

    @Override
    public int calcularPontos() {
        return getVendas() * 15;
    }
}
