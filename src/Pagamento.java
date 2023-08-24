public class Pagamento {
    private double valorPago;

    public Pagamento(double valorPago) {
        this.valorPago = valorPago;
    }

    public boolean verificarPagamento(double total) {
        return valorPago >= total;
    }
}
