public class Crianca extends Cardapio {
    public Crianca(Double adicional) {
        super(adicional);
    }
    @Override
    public void montar() {
        super.montar();
        System.out.println("Prato para crianças");
    }

    @Override
    public Double calcularPreco() {
        return (super.calcularPreco() + super.getAdicional() + 10D);
    }
}
