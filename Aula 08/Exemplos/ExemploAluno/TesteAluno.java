
import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtdeAlunos, qtdeNotas;
        float mediaGeral=0;
        Aluno alunos[]; //declaração do vetor de objetos do tipo Aluno
        
        System.out.println("Digite a quantidade de alunos da turma");
        qtdeAlunos=leia.nextInt();
        //instancia o vetor de objetos do tipo Aluno
        alunos=new Aluno[qtdeAlunos];
        
        for (int i=0;i<alunos.length; i++){
            System.out.println(
                    "Digite a quantidade de notas do aluno " + (i+1));
            qtdeNotas=leia.nextInt();
            //instanciar o objeto na posição do vetor
            //instancia para cada objeto o vetor de notas
            alunos[i]=new Aluno(qtdeNotas);
            alunos[i].leitura();
            mediaGeral+=alunos[i].calculaMedia();
            alunos[i].print();
        }
        System.out.println("Media geral da turma: " +
                (mediaGeral/qtdeAlunos));               
    }    
}
