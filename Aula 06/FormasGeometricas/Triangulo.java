public class Triangulo extends Forma {
    //Atributos
    private float base, altura;
    
    //Construtor
    public Triangulo(float b, float h){
            base = b;
            altura = h;
    }
    
    //Metodos de acesso
    public float getBase() { return base; }
    public float getAltura() { return altura; }
    public void setBase(float b) { base = b;  }
    public void setAltura(float h) { altura = h;  }
    
    //Implementação dos métodos abstratos da classe Forma
    public float area(){
            return (base * altura)/2;
    }
    public void mostra(){
            System.out.println("\nBase: " + base + "\nAltura: " + altura + "\nArea: " + area());
    }
}
