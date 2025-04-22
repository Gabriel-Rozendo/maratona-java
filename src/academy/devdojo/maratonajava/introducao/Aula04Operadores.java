package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - / *

        int n1 = 10;
        int n2 = 20;
        int resultado = n1 * n2;

        System.out.println(resultado);

        // %
        int resto = 21 % 7;

        System.out.println(resto);

        // < > <= => == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);

        // &&(AND) ||(OR) !(NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPlaystation = 5000;

        boolean isPlaystationCincoCompravel = (valorTotalContaCorrente >= valorPlaystation|| valorTotalContaPoupanca >= valorPlaystation);
        System.out.println("isPlaystationCincoCompravel: " + isPlaystationCincoCompravel);

        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        // Incremento = ++ Decremento = --
        int contador = 1;
        contador ++;

        System.out.println(++contador);

    }
}
