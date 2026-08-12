import Enums.SalaNum;

public class Sala {

    private int id;
    private String assentos;
    private String informacoesSala;
    private SalaNum tipoSala;

    // Construtor vazio

    public Sala() {
    }

    // Construtor com argumentos

    public Sala(int id, String assentos, String informacoesSala, SalaNum tipoSala) {
        this.id = id;
        this.assentos = assentos;
        this.informacoesSala = informacoesSala;
        this.tipoSala = tipoSala;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAssentos() {
        return assentos;
    }

    public void setAssentos(String assentos) {
        this.assentos = assentos;
    }

    public String getInformacoesSala() {
        return informacoesSala;
    }

    public void setInformacoesSala(String informacoesSala) {
        this.informacoesSala = informacoesSala;
    }

    public SalaNum getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(SalaNum tipoSala) {
        this.tipoSala = tipoSala;
    }
}