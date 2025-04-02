package NivelIntermediario.Desafios.Desafio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("## EXTRATOS E DEPOSITOS");

        ContaCorrente contaCorrente = new ContaCorrente(200.00);
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(200.00);
        contaCorrente.consultarSaldo();

        System.out.println();

        ContaPoupanca contaPoupanca = new ContaPoupanca(150.00);
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(150.00);
        contaPoupanca.consultarSaldo();

        System.out.println();

        System.out.println("## TRANSFERÊNCIAS");

        contaPoupanca.consultarSaldo();
        contaCorrente.consultarSaldo();
        contaPoupanca.transferir(contaCorrente, 100);
        contaPoupanca.consultarSaldo();
        contaCorrente.consultarSaldo();

        sc.close();
    }
}
