import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args){

        ServicoInternet internet = new ServicoInternet();
        internet.setDescricao("Modem");
        internet.setValorUnitario(200.00);

        ServicoBracal bracal = new ServicoBracal();
        bracal.setDescricao("Pintar a casa");
        bracal.setValorHora(180.00);

        ProdutoNovo notebook = new ProdutoNovo();
        notebook.setDescricao("HP Notebook HP Intel Core i3 8GB 256GB SSD 15,6” - HD Windows 11 256 G8");
        notebook.setValorUnitario(2400.00);

        ProdutoUsado carro = new ProdutoUsado();
        carro.setDescricao("Chevrolet Bel Air 1954 CADILLAC");
        carro.setValorProduto(2000.00);

        List<Vendavel> itensInserir = new ArrayList<>();
        itensInserir.add(internet);
        itensInserir.add(bracal);
        itensInserir.add(notebook);
        itensInserir.add(carro);

        Venda venda = new Venda();
        venda.setDataVenda(LocalDate.now());
        venda.setCliente("Gabriel");

        System.out.println(venda.getTotalVenda());
//        System.out.println(bracal);
//        System.out.println(notebook);
//        System.out.println(carro);

    }

}
