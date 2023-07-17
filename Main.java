import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int esc;
        Cartao credito = new Cartao(1000);

        do {
            System.out.println("Qual o saldo do cartao? ");
        }while(credito.setSaldo(scan.nextInt()));
        do{
            Compras carrinho = new Compras();
            System.out.println("Qual o nome do produto?");
            scan.nextLine();
            carrinho.setNome(scan.nextLine());
            System.out.println("Qual o preço de " + carrinho.getNome() + "?");
            carrinho.setPreco(scan.nextInt());
            credito.AdicionandoCarrinho(carrinho);
            System.out.println("Saldo restante: " + credito.getSaldo());
            do{
                System.out.println("Deseja continuar? [0 = nao/ 1 = sim]");
                esc = scan.nextInt();
                if(esc != 1 && esc != 0) System.out.println("Opcao invalida.");
            }while(esc != 1 && esc != 0);
        }while(esc == 1);
        System.out.println("---------------------");
        System.out.println("LISTA DE COMPRAS\n");
        credito.ListaDeCompras();
        System.out.println("\n---------------------");
        System.out.println("Saldo final: " + credito.getSaldo());
    }
}