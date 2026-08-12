import Enums.GeneroFilme;
import java.time.LocalDate;

public class Filme {

    private int id;
    private String nome;
    private GeneroFilme generoFilme;
    private double duracao;
    private String idioma;
    private String sinopse;
    private LocalDate dataEstreia;
    private String elencoEquipe;

    // Construtor Vazio
    public Filme() {
    }

    // Construtor com argumentos
    public Filme(int id, String nome, GeneroFilme generoFilme, double duracao, String idioma, String sinopse, LocalDate dataEstreia, String elencoEquipe) {
        this.id = id;
        this.nome = nome;
        this.generoFilme = generoFilme;
        this.duracao = duracao;
        this.idioma = idioma;
        this.sinopse = sinopse;
        this.dataEstreia = dataEstreia;
        this.elencoEquipe = elencoEquipe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GeneroFilme getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(GeneroFilme generoFilme) {
        this.generoFilme = generoFilme;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        if (duracao < 0) {
            System.out.println("A duração não pode ser negativa");
        } else {
            this.duracao = duracao;
        }
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public LocalDate getDataEstreia() {
        return dataEstreia;
    }

    public void setDataEstreia(LocalDate dataEstreia) {
        this.dataEstreia = dataEstreia;
    }

    public String getElencoEquipe() {
        return elencoEquipe;
    }

    public void setElencoEquipe(String elencoEquipe) {
        this.elencoEquipe = elencoEquipe;
    }
}