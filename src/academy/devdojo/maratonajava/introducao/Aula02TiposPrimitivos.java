package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        int idade = (int)10000000000L;
        long numeroGrande = 9999999999L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 3000;
        boolean isVerdadeiro = true;
        boolean isFalso = false;
        char caracter = 'A';
        String nome = "Naruto Uzumaki";

        System.out.println(idade);
        System.out.println(isFalso);
        System.out.println("Meu nome é: " + nome);
    }
}
