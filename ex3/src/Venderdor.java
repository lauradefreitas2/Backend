public abstract class Vendedor {

    private String nome;
    private int vendas;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public void vender(int qtdVendas) {
        this.vendas += qtdVendas;
        System.out.println("O(a) vendedor(a) " + getNome() + " realizou " + this.vendas + " vendas.");
    }

    public abstract int calcularPontos();

    public String getNomeCategoria(){
        if (calcularPontos() < 20)
        {
            return "Novato";
        }
        else if (calcularPontos() <= 30)
        {
            return "Aprendiz";
        }
        else if (calcularPontos() <= 40) {
            return "Bom";
        }
        else {
            return "Mestre";
        }
    }

    public String mostrarCategoria (){
        int pontosVendedor = calcularPontos();
        return "O(A) " + getNome() + " têm " + pontosVendedor + " pontos e sua categoria é: " + getNomeCategoria();
    }

}

