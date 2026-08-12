public class Combo {

    private String preco;
    private String tiposCombo;
    private String brindes;

    // Construtor vazio

    public Combo() {
    }

    //  Construtor com argumentos

    public Combo(String preco, String tiposCombo, String brindes) {
        this.preco = preco;
        this.tiposCombo = tiposCombo;
        this.brindes = brindes;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTiposCombo() {
        return tiposCombo;
    }

    public void setTiposCombo(String tiposCombo) {
        this.tiposCombo = tiposCombo;
    }

    public String getBrindes() {
        return brindes;
    }

    public void setBrindes(String brindes) {
        this.brindes = brindes;
    }
}