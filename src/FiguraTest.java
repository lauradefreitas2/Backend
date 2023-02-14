import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FiguraTest {
    @Test
    public void testarQuadrado() {
        Figura.Quadrado quadrado = new Figura.Quadrado(6.0);
        double perimetroEsperado = 24.0;
        double perimetroCalculado = quadrado.calcularPerimetro();
        assertEquals(perimetroEsperado, perimetroCalculado, 0.0);
    }
}