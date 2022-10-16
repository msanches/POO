public class Chefe extends Trabalhador{
    private double beneficio;
    
    public Chefe(){}
    
    public Chefe(String nome, String registro, double salario, double beneficio){
        super(nome,registro, salario);
        this.beneficio=beneficio;
    }

    public double getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(double beneficio) {
        this.beneficio = beneficio;
    }
    public void print(){
        super.print();
        System.out.println("Beneficio: "+ getBeneficio());
    }
    
}
