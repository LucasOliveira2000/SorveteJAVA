import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de compra de sorvete!");

        System.out.print("Quantas cascas de sorvete você deseja comprar? ");
        int quantCascas = scanner.nextInt();

        System.out.print("Quantas bolas de sorvete você deseja comprar? ");
        int quantBolas = scanner.nextInt();

        Sorvete sorvete = new Sorvete(quantCascas, quantBolas);
        sorvete.exibirResumo();

        System.out.print("\nDigite o valor pago: ");
        double valorPago = scanner.nextDouble();

        Pagamento pagamento = new Pagamento(valorPago);
        if (pagamento.verificarPagamento(sorvete.calcularTotal())) {
            System.out.println("Pagamento efetuado com sucesso!");
        } else {
            System.out.println("Valor insuficiente. Pagamento não foi efetuado.");
        }

        scanner.close();


    }
}