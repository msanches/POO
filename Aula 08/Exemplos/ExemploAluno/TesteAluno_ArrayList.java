
import java.util.ArrayList;
import java.util.Scanner;

public class TesteAluno_ArrayList {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtdeNotas;        
        Aluno auxiliar;
        ArrayList alunos=new ArrayList();
        String op;
        
        do{
            System.out.println(
                    "Digite a quantidade de notas do aluno ");
            qtdeNotas=leia.nextInt();            
            auxiliar=new Aluno(qtdeNotas);
            auxiliar.leitura();
            auxiliar.calculaMedia();
            alunos.add(auxiliar);                       
            System.out.println("Deseja Continuar?");
            op=leia.next();            
        }while(op.equalsIgnoreCase("s"));        
        
        for(int i=0;i<alunos.size(); i++){            
            auxiliar=(Aluno)alunos.get(i);
            auxiliar.print();
        }
    }
}
