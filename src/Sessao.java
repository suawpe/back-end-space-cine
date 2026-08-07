public class Sessao {
    public String informacoesIngressos;
    public String numeroSala;
    public String horarios;
    public String local;
    public String dia;
    public String tipoSessao;

    public Sessao(String informacoesIngressos, String numeroSala, String horarios,
                  String local, String dia, String tipoSessao) {
        this.informacoesIngressos = informacoesIngressos;
        this.numeroSala = numeroSala;
        this.horarios = horarios;
        this.local = local;
        this.dia = dia;
        this.tipoSessao = tipoSessao;
    }
}
