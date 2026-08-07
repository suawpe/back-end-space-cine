import Enums.GeneroFilme;

import java.time.LocalDate;

public class Filme {

    public int id;
    public String nome;
    public GeneroFilme generoFilme;
    public double duracao;
    public String idioma;
    public String sinopse;
    public LocalDate dataEstreia;
    public String elencoEquipe;

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
}
