import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        Pessoa p2;
        
        System.out.println("Digite o nome");
        String n = leia.nextLine();
        System.out.println("Digite a idade");
        int i = leia.nextInt();
        System.out.println("Digite a renda");
        double r = leia.nextDouble();
        
        p2 = new Pessoa(n, i, r);
        
        System.out.println("Nome" + p1.nome 
                + "\nIdade" + p1.idade
                + "\nRenda" + p1.renda);
        
        System.out.println("Nome" + p2.nome 
                + "\nIdade" + p2.idade
                + "\nRenda" + p2.renda);
    }
}
