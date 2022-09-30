import java.util.*;
public class UsaFormas{
    public static void main(String args[]){
        float b,a;
        Quadrado q;
        Triangulo t;        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a base do quadrado: ");
        b = scan.nextFloat(); //para String use o nextLine()
        q = new Quadrado(b);        
        //na chamada do metodo abaixo e passado um objeto da classe Quadrado
        q.mostra();
        
        System.out.print("Digite a base do triangulo: ");        
        b = scan.nextFloat();
        System.out.print("Digite a altura do triangulo: ");     
        a = scan.nextFloat();
        t = new Triangulo(b,a);
        //na chamada do metodo abaixo e passado um objeto da classe Triangulo
        t.mostra();
    }
}
