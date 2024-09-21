public class Conta {
    private String tipo;
    private double saldo;

    public Conta(String tipo, double saldoInicial) {
        this.tipo = tipo;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: " + valor + " na conta " + tipo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacado: " + valor + " da conta " + tipo);
        } else {
            throw new RuntimeException("Saldo insuficiente na conta " + tipo);
        }
    }
}

