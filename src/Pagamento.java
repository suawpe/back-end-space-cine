public class Pagamento {

    private String tipoIngresso;
    private String cupom;
    private String formaPagamento;
    private String comprovante;
    private String ingressoDigital;
    private String cancelarCompra;

    // Construtor vazio

    public Pagamento() {
    }

    // Construtor com argumentos

    public Pagamento(String tipoIngresso, String cupom, String formaPagamento,
                     String comprovante, String ingressoDigital, String cancelarCompra) {
        this.tipoIngresso = tipoIngresso;
        this.cupom = cupom;
        this.formaPagamento = formaPagamento;
        this.comprovante = comprovante;
        this.ingressoDigital = ingressoDigital;
        this.cancelarCompra = cancelarCompra;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public String getCupom() {
        return cupom;
    }

    public void setCupom(String cupom) {
        this.cupom = cupom;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getComprovante() {
        return comprovante;
    }

    public void setComprovante(String comprovante) {
        this.comprovante = comprovante;
    }

    public String getIngressoDigital() {
        return ingressoDigital;
    }

    public void setIngressoDigital(String ingressoDigital) {
        this.ingressoDigital = ingressoDigital;
    }

    public String getCancelarCompra() {
        return cancelarCompra;
    }

    public void setCancelarCompra(String cancelarCompra) {
        this.cancelarCompra = cancelarCompra;
    }
}