package NivelBasico.Arrays;

public class Array {
    public static void main(String[] args) {

        /*
         * Array: são fixos em tamanho (memória), são tipo referência
         * */

        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        System.out.println(ninja[5]);

        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[0]);
        System.out.println(idade[1]);

        // Redeclarar o Array (Garbage Collector básico, que é a realocação do array para o mesmo endereço de memória)
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naturo Uzumaki";

        System.out.println(ninja);

        // For para fazer um LOOP no array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }
    }
}
