package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        int idade = (int)10000000000000L; // Fazendo um casting

        long numeroGrande = 1000000000L; // Usar L no final do long
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F; // Usar F no final de um float
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean isVerdadeiro = true;
        boolean isFalso = false;
        char caractere = 65;
        String nome = "Gabriel";

        System.out.println("Meu nome é " + nome);
        System.out.println("A idade é " + idade + " anos");
        System.out.println(isVerdadeiro);
        System.out.println(caractere);
    }
}
