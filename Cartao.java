import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limite;
    private double saldo;
    private List<Compras> compras;

    public Cartao(double limite){
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }

    public boolean setSaldo(double saldo) {
        if(saldo < limite) {
            this.saldo = saldo;
            return false;
        }else {
            System.out.println("Saldo acima do limite");
            return true;
        }
    }

    public void AdicionandoCarrinho(Compras carrinho){
        if(this.saldo > carrinho.getPreco()) {
            compras.add(carrinho);
            this.saldo -= carrinho.getPreco();
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void ListaDeCompras(){
        for(Compras compra: compras){
            System.out.println(compra.getNome() + "-" + compra.getPreco());
        }
    }
}
