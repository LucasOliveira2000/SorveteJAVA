public class Sorvete {
    private int quantCascas;
    private int quantBolas;
    private double precoCasca = 1.50;
    private double precoBola = 2.00;

    public Sorvete(int quantCascas, int quantBolas) {
        this.quantCascas = quantCascas;
        this.quantBolas = quantBolas;
    }

    public double calcularTotal() {
        double totalCascas = quantCascas * precoCasca;
        double totalBolas = quantBolas * precoBola;
        return totalCascas + totalBolas;
    }

    public void exibirResumo() {
        System.out.println("\nResumo da compra:");
        System.out.println("Cascas de sorvete: " + quantCascas + " x " + precoCasca + " = " + quantCascas * precoCasca + " reais");
        System.out.println("Bolas de sorvete: " + quantBolas + " x " + precoBola + " = " + quantBolas * precoBola + " reais");
        System.out.println("Total da compra: " + calcularTotal() + " reais");
    }
}