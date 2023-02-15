public class Funcionario extends Vendedor {

    private int anosAntiguidade;
    private ArrayList<Afiliado> afiliados;

    public Funcionario(String nome, int anosAntiguidade) {
        super(nome);
        this.anosAntiguidade = anosAntiguidade;
        this.afiliados = new ArrayList<>();
    }

    public int getAnosAntiguidade() {
        return anosAntiguidade;
    }

    public void setAnosAntiguidade(int anosAntiguidade) {
        this.anosAntiguidade = anosAntiguidade;
    }

    public ArrayList<Afiliado> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(ArrayList<Afiliado> afiliados) {
        this.afiliados = afiliados;
    }

    public void addFuncionario (Afiliado afiliado) {
        afiliados.add(afiliado);
        System.out.println("O " + afiliado.getNome() + " foi cooptado por " + this.getNome());
    }

    @Override
    public int calcularPontos() {
        return getVendas() * 5 + 5 * anosAntiguidade + 10 * afiliados.size();
    }
}
