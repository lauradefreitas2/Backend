public class Vegano extends Cardapio {

    public Vegano(Double adicional) {
        super(adicional);
    }

    @Override
    public void montar() {
        super.montar();
        System.out.println("Prato vegano");
    }

    @Override
    public Double calcularPreco() {
        return ((super.calcularPreco() + super.getAdicional()) * 1.01D);
    }
}
