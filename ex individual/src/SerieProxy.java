public class SerieProxy implements ISerie {

    //ATRIBUTOS
    private Integer qtdViews =0;


    //IMPLMENTAÇÃO DO MÉTODO
    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException {
        if (qtdViews <5 ){
            ISerie serie = new Serie(nome);
            System.out.println("Link " + serie.getSerie(nome));
            qtdViews += 1;

        } else {
            throw new SerieNaoHabilitadaException();
        }


        return null;
    }
}
