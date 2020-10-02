package exemplopolimorfismo;

public class ExemploPolimorfismo2 {
    public static void main(String[] args) {
        Pessoa s ; 
        s = new Aluno("Leo","22222-2");  
        
        //a chamada abaixo irá ocasionar um erro de compilação
        //System.out.println(s.getRgm());
        //chamada correta 
        System.out.println( ((Aluno)s).getRgm() );
    }
}
