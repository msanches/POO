public class TriAtleta extends Pessoa implements Nadador, Corredor, Ciclista {   
   
    public TriAtleta(String nome) {   
        super(nome);   
    }   
  
    public void aquecer() {   
        System.out.println(this.getNome() + " está aquecendo");   
    }   
       
    public void nadar() {   
        System.out.println(this.getNome() + " está nadando");   
    }   
       
    public void correr() {   
        System.out.println(this.getNome() + " está correndo");   
    }   
       
    public void correrDeBicicleta() {   
        System.out.println(this.getNome() + " está correndo de bike");   
    }   
  
}