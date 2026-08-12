public class Sessao {

    private String informacoesIngressos;
    private String numeroSala;
    private String horarios;
    private String local;
    private String dia;
    private String tipoSessao;

    // Construtor vazio

    public Sessao() {
    }

    // Construtor com argumentos

    public Sessao(String informacoesIngressos, String numeroSala, String horarios,
                  String local, String dia, String tipoSessao) {
        this.informacoesIngressos = informacoesIngressos;
        this.numeroSala = numeroSala;
        this.horarios = horarios;
        this.local = local;
        this.dia = dia;
        this.tipoSessao = tipoSessao;
    }

    public String getInformacoesIngressos() {
        return informacoesIngressos;
    }

    public void setInformacoesIngressos(String informacoesIngressos) {
        this.informacoesIngressos = informacoesIngressos;
    }

    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTipoSessao() {
        return tipoSessao;
    }

    public void setTipoSessao(String tipoSessao) {
        this.tipoSessao = tipoSessao;
    }
}