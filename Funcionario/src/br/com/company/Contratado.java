package br.com.company;

public class Contratado extends Funcionario{

    private double valorHora;

    private int horas;

    public Contratado(String nome, String sobrenome, String numeroConta, double valorHora, int horas) {
        super(nome, sobrenome, numeroConta);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    @Override
    public double calcularSalario() {
        return valorHora*horas;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Gerado um recibo - PJ no valor de: " + quantia);
    }

}
