public class Main {
    public static void main(String[] args) {
        Adulto a = new Adulto();
        a.montar();
        System.out.println(a.calcularPreco());

        Infantil i = new Crianca(15D);
        ((Crianca) i).montar();
        System.out.println(i.calcularPreco());

        Veggie v = new Vegano(10D);
        v.montar();
        System.out.println(v.calcularPreco());
    }
}