package exemplopolimorfismo;

public class ExemploPolimorfismo1 {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[3];
        p[0] = new Pessoa("José");
        p[1] = new Aluno("Lukas","11111-1");
        p[2] = new Professor("Obama",111223);
        
        for (int i=0; i < p.length; i++){
            System.out.println(p[i].toString());
        }
    }    
}



