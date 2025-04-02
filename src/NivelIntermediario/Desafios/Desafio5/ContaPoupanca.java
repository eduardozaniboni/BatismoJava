package NivelIntermediario.Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual da conta poupança: " + this.saldo);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor - (valor * 0.01);
        System.out.println("Deposito realizado na conta poupança.");
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        this.saldo -= valor;
        contaDestino.saldo += valor;
    }
}
