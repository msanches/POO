
import java.util.Scanner;

public class Aluno {   
    private String rgm;   
    private float notas[]; //declaração do vetor de notas
    private float media;

    public Aluno(String rgm, int qtde) {        
        this.rgm = rgm;        
        this.notas = new float[qtde];//instacia o vetor de notas        
    }
    public Aluno(int qtde){
        this.notas = new float[qtde];//instacia o vetor de notas        
    }
    public Aluno() {}  
    
    public String getRgm() {return rgm;}
    public void setRgm(String rgm) { this.rgm = rgm;}
    public float[] getNotas() {return notas;}
    public void setNotas(float[] notas) {this.notas = notas;}
    
    public void leitura(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o RGM");
        rgm=leia.nextLine();        
        for(int i=0;i<notas.length;i++){
            System.out.println("Digite a nota " +(i+1));
            notas[i]=leia.nextFloat();
        }        
    }
    public float calculaMedia(){
        float soma=0;
        for(int i=0;i<notas.length;i++){
            soma+=notas[i];
        }
        media=soma/notas.length;
        return media;
    }
    public void print(){
        String saida;
        saida="RGM: " + rgm +"\n";        
        saida+="Notas: ";
        for(int i=0;i<notas.length;i++){
            saida += "[ " + notas[i] + " ]";
        }
        saida+="\n";
        saida+="Media: "+ media +"\n";
        System.out.println("Dados do aluno: " + saida);
    }
}
