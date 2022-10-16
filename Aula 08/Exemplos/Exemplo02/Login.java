public class Login {

    private String nome;
    private String acesso;
    private String password;

    private String[][] users = {
        {"marco", "123", "admin"},
        {"luiza", "123", "enfermeira"},
        {"luka", "123", "médico"}};
    
    private String[][] pacientes = {{"Marco", "16"}};
    
    public Login() {
    }

    public Login(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public String getAcesso() {
        return acesso;
    }

    public boolean autentica() {
        for (int i = 0; i < users.length; i++) {
            if (users[i][0].equals(nome) && users[i][1].equals(password)) {
                acesso = users[i][2];
                return true;
            }
        }
        return false;
    }
    
    public int teste(){
        return users.length;
    }
}
