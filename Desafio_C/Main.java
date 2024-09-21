public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente(100);
        Conta contaPoupanca = new ContaPoupanca(50);

        contaCorrente.depositar(50);

        try {
            contaCorrente.sacar(200); // Deve gerar erro
        } catch (RuntimeException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        try {
            contaPoupanca.sacar(60); // Deve gerar erro
        } catch (RuntimeException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
