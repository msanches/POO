public class Trabalhador {
    private String nome;
    private String registro;
    private double salario;
    
    public Trabalhador(){}
    public Trabalhador(String nome, String registro, double salario){
        this.nome=nome;
        this.registro=registro;
        this.salario=salario;
    }

    public String getNome() {
        return nome;
    }

    public String getRegistro() {
        return registro;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void print(){
        System.out.println("Nome: " + getNome()+"\nRegistro: " + getRegistro()+ "\nSalario: " + getSalario()+ "\n");
    }
}
