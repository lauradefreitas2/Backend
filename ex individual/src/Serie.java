public class Serie implements ISerie{

    //ATRIBUTOS
    private String nome;

    //CONSTRUTOR
    public Serie(String nome) {
        this.nome = nome;
    }


    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    //IMPLEMENTAÇÃO DO MÉTODO
    @Override
    public String getSerie(String nome) {
        return "www." + nome;
    }
}
