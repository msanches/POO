public class Quadrado extends Forma {
    //Atributos
    private float base;
    
    //Construtor
    public Quadrado(float b){ base = b;  }

    //Metodos de acesso
    public float getBase() { return base; }
    public void setBase(float b) { base = b; }
    
    //sobreposição do método da classe Pessoa
    public float perimetro(){
        return base * 4;
    }
    
    //Implementação dos métodos abstratos da classe Forma
    public float area(){ 
        return base * base;
    }
    public void mostra(){
        System.out.println("Base: " + base + "\nPerimetro: "+ perimetro() + "\nArea: " + area());
    }
}
