import java.time.LocalDate;
import java.util.List;

public class Venda {

    private LocalDate dataVenda;
    private String cliente;
    private List<Vendavel> itensVenda;

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Vendavel> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<Vendavel> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public Double getTotalVenda() {
        Double total = 0.00;
        for (Vendavel item : itensVenda){
            total += item.getValorVenda();
        }
        return total;
    }
}
