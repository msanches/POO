public class ContaCorrente {    
    String nome;    
    float saldo;
    float limite;
    char tipo;
    
    ContaCorrente(String n, float s, float l, char t){
        nome = n;        
        saldo = s;
        limite = l;
        tipo = t;
    }
    
    ContaCorrente(String n, float s, char t){
        nome = n;
        saldo = s;
        tipo=t;
    }
}
