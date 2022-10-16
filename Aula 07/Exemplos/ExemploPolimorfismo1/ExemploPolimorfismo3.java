package exemplopolimorfismo;

public class ExemploPolimorfismo3 {
    public static void main(String[] args) {
        Pessoa s = new Aluno("Alcides","213232");        
        //System.out.println(   ( (Aluno)s ).getRgm()   );
        if (s instanceof Aluno){
            //só irá executar se S for do tipo ALUNO
           System.out.println(   ( (Aluno)s ).getRgm()   );
        }
        
    }    
}
