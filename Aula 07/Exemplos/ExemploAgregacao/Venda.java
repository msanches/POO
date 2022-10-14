public class Venda {
    private Vendedor vendedor;
    private Produto produto;
    private double vFinal;

    public Venda() {}

    public Venda(Vendedor vendedor, Produto produto) {
        this.vendedor = vendedor;
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getvFinal() {
        return vFinal;
    }

    public void setvFinal(double vFinal) {
        this.vFinal = vFinal;
    }
    
    public void concretizaVenda(){
        //100 - 3% = 3 R$ 3,00
        //100 + 3 = R$ 3,00
        vendedor.setComissao(produto.getPreco()*vendedor.getComissao()/100);
        vFinal = produto.getPreco() + vendedor.getComissao();
    }
    
    public void imprimir(){
        System.out.println("Valor do produto: R$" + produto.getPreco() +
            "\nComissao: R$ " + vendedor.getComissao() +
            "\nValor final do produto: R$ " + vFinal);
    }
}
