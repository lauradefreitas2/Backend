import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main {

    @Test
    @DisplayName("Até 5 séries")
    void testarQtdSeries() throws SerieNaoHabilitadaException {
        ISerie serie = new SerieProxy();
        serie.getSerie("Naruto");
        serie.getSerie("Chapolin");
        serie.getSerie("Corrida");
        serie.getSerie("Perdidos");
        serie.getSerie("Motos");
        System.out.println("--------------------------------------");
    }

    @Test
    @DisplayName("Mais de 5 Séries")
    void testarQtdSeries2() throws SerieNaoHabilitadaException {
        ISerie serie = new SerieProxy();
        serie.getSerie("Naruto");
        serie.getSerie("Chapolin");
        serie.getSerie("Corrida");
        serie.getSerie("Perdidos");
        serie.getSerie("Motos");
        serie.getSerie("Sei la");
        serie.getSerie("Chaveando");
        System.out.println("--------------------------------------");

    }


}
