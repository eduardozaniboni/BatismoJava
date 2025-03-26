package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
         * Dados não primitivos: String, Array, Class, enum
         * Objetivo: Criar um ninja, e atribuir métodos para ele
         * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // toUpperCase vai colocar tudo maiúsculo
        System.out.println(nome);
        System.out.println("Esse texto está em CAPSLOCK: " + nomeUpperCase);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println(aldeiaLowerCase);
    }
}
