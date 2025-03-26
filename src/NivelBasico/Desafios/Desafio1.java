package NivelBasico.Desafios;

public class Desafio1 {

    public static void main(String[] args) {

        /*
         * DESCRIÇÃO DO DESAFIO
         * Crie um programa que represente TRÊS ninjas da Vila da Folha (Konoha) de "Naruto" e suas respectivas missões.
         * Cada ninja tem um NOME, uma IDADE e uma MISSÃO atribuída a ele, com o NOME DA MISSÃO, NÍVEL DE DIFICULDADE e STATUS DE CONCLUSÃO
         *
         * DICAS EXTRAS
         * [ ] Identifique os tipos de dados que você vai precisar. Ex.: String, int
         * [ ] Crie variáveis por exemplo, String nomeNinja1 = "Naruto"; para o nome de um ninja
         * [ ] Imprima os dados: Use System.out.println() para mostrar as informações
         *
         * QUER MAIS DIFICULDADE?
         * Use condicionais para verificar se o ninja pode concluir a missão baseado na sua idade:
         * - Ninjas menores de 15 anos só podems concluir missões de nível C ou D. Ninjas com 15 anos ou mais podem concluir missões de qualquer nível.
         * Altere o status da missão para "concluída" ou "não concluída" de acordo com essa lógica e imprima o resultado.
         * */

        // Ninja 1
        String nomeNinja = "Naruto Uzumaki";
        int idade = 14;
        String missao = "Capturar bandidos";
        char nivelMissao = 'A';
        String statusMissao = "Em andamento";

        if (idade < 15) {
            if (nivelMissao == 'D' || nivelMissao == 'C') {
                statusMissao = "Concluída";
            } else {
                statusMissao = "Não concluída";
            }
        } else {
            statusMissao = "Concluída";
        }

        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 16;
        String missao2 = "Reconhecimento da aldeia";
        char nivelMissao2 = 'S';
        String statusMissao2 = "Em andamento";

        if (idade2 < 15) {
            if (nivelMissao2 == 'D' || nivelMissao2 == 'C') {
                statusMissao2 = "Concluída";
            } else {
                statusMissao2 = "Não concluída";
            }
        } else {
            statusMissao2 = "Concluída";
        }

        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 15;
        String missao3 = "Curar feridos";
        char nivelMissao3 = 'D';
        String statusMissao3 = "Concluída";

        if (idade3 < 15) {
            if (nivelMissao3 == 'D' || nivelMissao3 == 'C') {
                statusMissao3 = "Concluída";
            } else {
                statusMissao3 = "Não concluída";
            }
        } else {
            statusMissao3 = "Concluída";
        }

        // Ninja 1
        System.out.println("--------------------------------------------------");
        System.out.println("Nome do Ninja: " + nomeNinja);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível da Missão: " + nivelMissao);
        System.out.println("Status da MIssão: " + statusMissao);
        System.out.println("--------------------------------------------------");

        // Ninja 2
        System.out.println("--------------------------------------------------");
        System.out.println("Nome do Ninja: " + nomeNinja2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Nível da Missão: " + nivelMissao2);
        System.out.println("Status da MIssão: " + statusMissao2);
        System.out.println("--------------------------------------------------");

        // Ninja 3
        System.out.println("--------------------------------------------------");
        System.out.println("Nome do Ninja: " + nomeNinja3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Nível da Missão: " + nivelMissao3);
        System.out.println("Status da MIssão: " + statusMissao3);
        System.out.println("--------------------------------------------------");

    }

}
