import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlunoArray {
    public static void main(String[] args) {
        int qtdeNotas;
        Aluno aluno;
        ArrayList alunos = new ArrayList();
        String op;
        
        do{
            qtdeNotas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de notas do aluno: "));
            aluno = new Aluno(qtdeNotas);
            aluno.leitura();
            aluno.calculaMedia();
            alunos.add(aluno);
            op = JOptionPane.showInputDialog(null, "Deseja continuar?");
        }while(op.equalsIgnoreCase("s"));
        
        for(int i=0; i<alunos.size(); i++){
            aluno = (Aluno)alunos.get(i);
            aluno.print();
        }
    }
}
