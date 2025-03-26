package NivelIntermediario.Desafios.Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int codigoMenu = 0;
        Ninja[] ninjas = new Ninja[10];

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Recuperar o amuleto";
        sasuke.nivelDificuldade = "Alta";
        sasuke.statusMissao = "Em andamento";
        sasuke.mostrarInformacoes();

        /*while (codigoMenu != 5) {
            System.out.println("==== MENU NINJA ====");
            System.out.println("- (1) Listar Ninjas");
            System.out.println("- (2) Cadastrar Ninjas");
            System.out.println("- (3) Atualizar Habilidade Especial");
            System.out.println("- (5) Sair");
            System.out.println("====================");

            System.out.println("Escolha uma das opções: ");
            codigoMenu = sc.nextInt();
            sc.nextLine();

            switch (codigoMenu) {
                case 1:
                    ninjas[0].mostrarInformacoes();
                    break;
                case 2:

                    break;
                default:
                    break;
            }
        }*/

        sc.close();

    }
}
