public class Calcado extends Vestuario{
    private String materialsola;
    private String materialpartesuperior;
    private String materialinterno;

    public Calcado() {   }

    public Calcado(String materialsola, String materialpartesuperior, String materialinterno, 
            String nome, String cor, String tamanho, int codigo, float valor) {
        super(nome, cor, tamanho, codigo, valor);
        this.materialsola = materialsola;
        this.materialpartesuperior = materialpartesuperior;
        this.materialinterno = materialinterno;
    }

    public String getMaterialsola() {
        return materialsola;
    }

    public String getMaterialpartesuperior() {
        return materialpartesuperior;
    }

    public String getMaterialinterno() {
        return materialinterno;
    }

    public void setMaterialsola(String materialsola) {
        this.materialsola = materialsola;
    }

    public void setMaterialpartesuperior(String materialpartesuperior) {
        this.materialpartesuperior = materialpartesuperior;
    }

    public void setMaterialinterno(String materialinterno) {
        this.materialinterno = materialinterno;
    }
    
    public String print(){
        String saida = "Dados do calçado:" + super.print();
        saida += "\nMaterial da sola: " + materialsola;
        saida += "\nMaterial da parte superior: " + materialpartesuperior;
        saida += "\nMaterial da parte interna: " + materialinterno;
        return saida;
    }
}
