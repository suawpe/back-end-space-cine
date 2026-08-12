public class Avaliacoes {

    private String usuario;
    private String estrelas;
    private String resenhaCritica;
    private String dataResenha;

    // Construtor Vazio

    public Avaliacoes() {
    }

    // Construtor com argumentos

    public Avaliacoes(String usuario, String estrelas, String resenhaCritica, String dataResenha) {
        this.usuario = usuario;
        this.estrelas = estrelas;
        this.resenhaCritica = resenhaCritica;
        this.dataResenha = dataResenha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(String estrelas) {
        this.estrelas = estrelas;
    }

    public String getResenhaCritica() {
        return resenhaCritica;
    }

    public void setResenhaCritica(String resenhaCritica) {
        this.resenhaCritica = resenhaCritica;
    }

    public String getDataResenha() {
        return dataResenha;
    }

    public void setDataResenha(String dataResenha) {
        this.dataResenha = dataResenha;
    }
}