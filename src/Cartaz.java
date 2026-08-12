public class Cartaz {

    private String titulo;
    private String imagem;
    private String classificacaoIndicativa;
    private String dataEstreia;
    private String genero;
    private String duracao;

    //  Construtor Vazio
    public Cartaz() {
    }

    //  Construtor com argumentos

    public Cartaz(String titulo, String imagem, String classificacaoIndicativa,
                  String dataEstreia, String genero, String duracao) {
        this.titulo = titulo;
        this.imagem = imagem;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.dataEstreia = dataEstreia;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String getDataEstreia() {
        return dataEstreia;
    }

    public void setDataEstreia(String dataEstreia) {
        this.dataEstreia = dataEstreia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}