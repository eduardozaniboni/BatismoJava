package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        * Scammer = É um jeito de trazer o usuário para dentro da aplicação
        * Objetivo: O usuário um ninja e vamos validar os dados
        * */

        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Qual o nome do ninja?");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.println("Qual a idade do ninja?");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos");

        if (idadeDoNinja >= 18) {
            System.out.println("O " + nomeDoNinja + " já maior de idade, pode fazer missões fora da aldeia");
        } else {
            System.out.println("O " + nomeDoNinja + " ainda é muito novo, precisa treinar mais antes de sair da vila");
        }


        caixaDeTexto.close();

    }
}
