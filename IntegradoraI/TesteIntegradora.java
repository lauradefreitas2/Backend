package IntegradoraI;

import org.junit.jupiter.api.Test;

public class TesteIntegradora {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Oscar Alho", 5);
        Funcionario funcionario2 = new Funcionario("Jahlin Habbei", 5);
        Afiliado afiliado1 = new Afiliado("Freddy Kruger");
        Afiliado afiliado2 = new Afiliado("Michael Mayers");
        Afiliado afiliado3 = new Afiliado("Jason Voorhees ");

        funcionario1.vender(3);
        funcionario1.addFuncionario(afiliado1);
        funcionario1.addFuncionario(afiliado2);
        System.out.println(funcionario1.mostrarCategoria());
        funcionario2.vender(3);
        funcionario2.addFuncionario(afiliado3);
        System.out.println(funcionario2.mostrarCategoria());;
        afiliado1.vender(1);
        System.out.println(afiliado1.mostrarCategoria());
        afiliado2.vender(2);
        System.out.println(afiliado2.mostrarCategoria());
        afiliado3.vender(2);
        System.out.println(afiliado3.mostrarCategoria());

    }
}