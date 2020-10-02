
public class Venda {
    private Produto produto;
    private Vendedor vendedor;
    private float vfinal;
    
    Venda(){}
    Venda(Produto p, Vendedor v){
        produto=p;
        vendedor=v;        
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public float getVfinal() {
        return vfinal;
    }
    public void setVfinal(float vfinal) {
        this.vfinal = vfinal;
    }
    public void concretizaVenda(){
        vendedor.setComissao(vendedor.getComissao()+produto.getPreco()*0.1f);
        vfinal=vendedor.getComissao() + produto.getPreco();
    }
    public void imprimir(){
        System.out.println("Valor: "+ produto.getPreco()+
                "\nComissao: "+ vendedor.getComissao()+"\nValorFinal: "+ vfinal);
    }
}
