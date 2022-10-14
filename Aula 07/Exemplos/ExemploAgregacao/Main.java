public class Main {
    public static void main(String[] args) {
        Venda v1 = new Venda(new Vendedor(4), new Produto(400));

        v1.concretizaVenda();
        System.out.println("Primeira venda:");
        v1.imprimir();
        
        Venda v2 = new Venda(new Vendedor(5), new Produto(2000));
        v2.concretizaVenda();
        System.out.println("Segunda venda:");
        v2.imprimir();
    }
}