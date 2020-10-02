
public class TesteAgregacao {

    public static void main(String[] args) {
       Venda vendasHoje=new Venda(new Produto(120.50f),new Vendedor(100f));
       vendasHoje.concretizaVenda();
       vendasHoje.imprimir();
       
       Venda v = new Venda(new Produto(100f),new Vendedor(50f));
       
       v.concretizaVenda();
       v.imprimir();
    }
    
}
