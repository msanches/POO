public class Empresa {
    private Trabalhador trab[];    
    private Chefe diretor;
       
    public Empresa(Trabalhador t[], Chefe d){
        trab = t; 
        diretor = d;         
    }
    
    public Empresa(Chefe d){
        diretor = d;
    }
    public Trabalhador[] getTrab() {
        return trab;
    }   
    public Chefe getDiretor() {
        return diretor;
    }    
   
    public void setTrab(Trabalhador[] trab) {
        this.trab = trab;
    }    
    public void setDiretor(Chefe diretor) {
        this.diretor = diretor;
    }    
   
    public double salarioMedio(){
        double soma=0, media;
        int i,qtde=0;
        for(i=0; i<trab.length;i++){
             if(trab[i]!=null){
                soma+=trab[i].getSalario(); 
                qtde++;
             }
        }
        media=soma/qtde;
        return media;
    }
   
    
    public void print(){ 
        
        for (int i=0;i<trab.length;i++){
            if(trab[i]!=null){
                System.out.println("Dados do Trabalhador " + (i+1));
                trab[i].print();
            }
        }       
       System.out.println("Diretor: ");
       diretor.print();  
    }
}
