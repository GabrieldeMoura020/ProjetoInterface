public class ProdutoUsado implements Vendavel {

    private String descricao;
    private Double valorProduto;
    private Integer anosUso;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Double getAnosUso() {
        return ((valorProduto * 0.025) * anosUso);
    }

    public void setAnosUso(Integer anosUso) {
        this.anosUso = anosUso;
    }

    @Override
    public Double getValorVenda() {
        return valorProduto;
    }
}
