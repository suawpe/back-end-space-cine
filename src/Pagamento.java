public class Pagamento {
    public String tipoIngresso;
    public String cupom;
    public String formaPagamento;
    public String comprovante;
    public String ingressoDigital;
    public String cancelarCompra;

    public Pagamento(String tipoIngresso, String cupom, String formaPagamento,
                     String comprovante, String ingressoDigital, String cancelarCompra) {
        this.tipoIngresso = tipoIngresso;
        this.cupom = cupom;
        this.formaPagamento = formaPagamento;
        this.comprovante = comprovante;
        this.ingressoDigital = ingressoDigital;
        this.cancelarCompra = cancelarCompra;
    }
}
