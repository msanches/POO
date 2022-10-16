package exemplopolimorfismo;

public class Professor extends Pessoa{
    private int matricula;
    
    public Professor(){}
    
    public Professor(String n,int mat){
        super(n);
        matricula = mat;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    @Override
    public String toString(){
        return matricula + " : " + getNome();
    } 
}
