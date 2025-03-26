package NivelBasico.Desafios;

import java.util.Scanner;

public class Desafio2 {
    private static int codigoMenu;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] ninja = new String[10];
        int codigoMenu = 0;
        int quantidadeNinjas = 0;

        while (codigoMenu != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar ninja");
            System.out.println("3. Remover ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            codigoMenu = sc.nextInt();
            sc.nextLine();

            switch (codigoMenu) {
                case 1:
                    if (quantidadeNinjas < ninja.length) {
                        System.out.println("\nEscreve aqui o nome do ninja:");
                        ninja[quantidadeNinjas] = sc.nextLine();
                        quantidadeNinjas++;
                        System.out.println("\nNinja cadastrado com sucesso");
                    } else {
                        System.out.println("\nQuantidade máxima de ninjas cadastrados");
                    }
                    break;
                case 2:
                    if (quantidadeNinjas == 0) {
                        System.out.println("\nAinda não existem ninjas cadastrados");
                    } else {
                        System.out.println("\n=====Lista de Ninjas=====");
                        for (int i = 0; i < ninja.length; i++) {
                            System.out.println((i + 1) + ". " + ninja[i]);
                        }
                    }
                    break;
                case 3:
                    int ninjaRemovido = 0;
                    while (ninjaRemovido <= 0 || ninjaRemovido > ninja.length) {
                        System.out.println("\nQual ninja você gostaria de remover?");
                        ninjaRemovido = sc.nextInt();
                        sc.nextLine();
                        if (ninjaRemovido <= 0 || ninjaRemovido > ninja.length) {
                            System.out.println("\nEsse ninja não está no cadastro");
                        }
                        for (int i = ninjaRemovido - 1; i < quantidadeNinjas; i++) {
                            ninja[i] = ninja[i + 1];
                        }
                        System.out.println("\nNinja removido e lista ajustada");
                    }
                    break;
                case 4:
                    System.out.println("\nEstamos saindo, até mais!");
                    break;
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }

        }

        sc.close();

    }
}
