public abstract class Cardapio {
    private Double preco = 50.0;
    private Double adicional;
    public Cardapio(Double adicional) {
        this.adicional = adicional;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double precoBase) {
        this.preco = precoBase;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }

    public void montar() {
        System.out.println("Montagem do prato.");
    }

    public Double calcularPreco() {
        return preco;
    }
}