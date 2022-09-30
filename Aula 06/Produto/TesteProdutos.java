public class TesteProdutos {

    public static void main(String[] args) {
        Produto p = new Produto(10, 15.89f);
        System.out.println(p.print());
        
        Eletronico e = new Eletronico("TV", 110, 12, 2500);
        System.out.println(e.print());
        
        Vestuario v = new Vestuario("camisa","amarela","GG", 33, 45.9f);
        System.out.println(v.print());
        
        Calcado c = new Calcado("borracha", "borracha", "borracha", "chinelo","branco","39", 23, 25.9f);
        System.out.println(c.print());
        
        Roupa r = new Roupa("malha", "calça","cinza","M", 78, 49.9f);
        System.out.println(r.print());
    }
    
}
