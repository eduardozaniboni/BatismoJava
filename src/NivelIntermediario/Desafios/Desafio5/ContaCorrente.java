package NivelIntermediario.Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual da conta corrente: " + this.saldo);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito realizado na conta corrente.");
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        this.saldo -= valor;
        contaDestino.saldo += valor;
    }
}
