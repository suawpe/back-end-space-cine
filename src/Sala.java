import Enums.SalaNum;

public class Sala {

    public int id;
    public String assentos;
    public String informacoesSala;
    public SalaNum tipoSala;

    public Sala(int id, String assentos, String informacoesSala, SalaNum tipoSala) {
        this.id = id;
        this.assentos = assentos;
        this.informacoesSala = informacoesSala;
        this.tipoSala = tipoSala;
    }
}
