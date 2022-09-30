public class Livro extends Publicacao{
    private String[] autores;
    private String editora;
    
    public Livro(String t, String a[], String e){
        super(t, "");
        autores = a;
        editora = e;
    }
    
    public String[] getAutores() {  return autores;  }
    public String getEditora() { return editora;  }
    public void setAutores(String[] autores) {  this.autores = autores;  }
    public void setEditora(String editora) {  this.editora = editora;  }
    
    public void imprimir(){
        String saida = "Título: " + getTitulo();
        saida += "\nData de Publicação: " + getDataPublicacao();
        saida += "\nAutor(es): ";
        /*
        for (String autore : autores) {
            saida += "\n" + autore;
        }
        */
        for(int i=0; i<autores.length; i++){
            saida += "\n" + autores[i];
        }
        saida += "\nEditora: "+ editora;
        System.out.println(saida);
    }
}
