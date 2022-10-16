import javax.swing.JOptionPane;

public class Aluno {
    private String rgm;
    private float[] notas;//declaração do vetor de notas
    private float media;

    public Aluno() {}

    public Aluno(String rgm, int qtde) {
        this.rgm = rgm;
        this.notas = new float[qtde];//instancia o vetor de notas
    }
    
    public Aluno(int qtde){
        this.notas = new float[qtde];//instancia o vetor de notas
    }

    public String getRgm() {return rgm;}
    public void setRgm(String rgm) {this.rgm = rgm;}
    public float[] getNotas() {return notas;}
    public void setNotas(float[] notas) { this.notas = notas; }
    
    public void leitura(){
        rgm = JOptionPane.showInputDialog(null, "Digite o RGM");
        for(int i=0; i <notas.length; i++){
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota " + (i+1)));
        }
    }
    
    public float calculaMedia(){
        float soma = 0;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        media = soma/notas.length;
        return media;
    }
   
    public void print(){
        String saida;
        saida = "RGM: " + rgm + "\n";
        saida += "Notas: ";
        for(int i = 0; i < notas.length; i++){
            saida +="[" + notas[i] +"]";
        }
        saida += "\n";
        saida += "Média: " + media + "\n";
        System.out.println("Dados do aluno: \n" + saida);
    }
}


