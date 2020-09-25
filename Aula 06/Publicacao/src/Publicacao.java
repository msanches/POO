public abstract class Publicacao {
    private String titulo;
    private String dataPublicacao;
    
    public Publicacao(String t, String d){
        titulo = t;
        dataPublicacao = d;
    }

    public String getTitulo() {  return titulo; }
    public String getDataPublicacao() { return dataPublicacao;  }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDataPublicacao(String dataPublicacao) { this.dataPublicacao = dataPublicacao;  }
    
    public abstract void imprimir();
}
