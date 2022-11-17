public class ServicoInternet implements Vendavel {

    private String descricao;
    private Double valorUnitario;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public Double getValorVenda() {
        return valorUnitario;
    }
}
