
import javax.swing.JOptionPane;
public class TesteComposicao {
    public static void main(String[] args) {
        // Em outra classe Principal, criar uma empresa (um objeto da classe Empresa) e ler os dados da mesma.
        Empresa sistemas;        
        Chefe diretor;        
        String nome,registro;
        double salario, beneficio;        
  
        int qtdeTrab=100;
        Trabalhador trab[]=new Trabalhador[qtdeTrab];       
        
        for (int i=0;i<2;i++){
            nome = JOptionPane.showInputDialog("Digite o nome do trabalhador");
            registro=JOptionPane.showInputDialog("Digite o número do registro do trabalhador");
            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do trabalhador"));
            trab[i] = new Trabalhador(nome, registro, salario);
        }
      
        //dados do diretor
        nome = JOptionPane.showInputDialog("Digite o nome do diretor");
        registro=JOptionPane.showInputDialog("Digite o número do registro do diretor");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do diretor"));
        beneficio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do beneficio do diretor"));
        diretor = new Chefe(nome, registro, salario, beneficio);        
                
        sistemas = new Empresa(trab, diretor);
        sistemas.print();
        
        System.out.println("Salário Médio: " + sistemas.salarioMedio());  
    }
}
