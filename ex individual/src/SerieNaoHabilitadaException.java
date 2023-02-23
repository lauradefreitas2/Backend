public class SerieNaoHabilitadaException extends Exception{

    public SerieNaoHabilitadaException () {
        super("Execede o número de reproduções permitidas");
    }

}